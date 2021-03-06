package com.example.api.client

import com.example.api.api.PokeApi
import com.example.model.model.PokeDexApiException
import com.example.model.model.PokeDexApiResponseException
import com.example.model.response.PokemonListResponse
import com.github.michaelbull.result.Err
import com.github.michaelbull.result.Ok
import com.github.michaelbull.result.Result
import retrofit2.Response

interface PokeApiClient {

    companion object {
        private const val TOTAL_POKEMONS_COUNT = 807
    }

    suspend fun fetchPokemonList(limit: Int = TOTAL_POKEMONS_COUNT): Result<PokemonListResponse?, PokeDexApiException>
}

internal class PokeApiClientImpl(
    private val pokeApi: PokeApi
) : PokeApiClient {

    override suspend fun fetchPokemonList(limit: Int): Result<PokemonListResponse?, PokeDexApiException> {
        return execute { pokeApi.pokemon(limit) }
    }

    private suspend fun <T> execute(block: suspend () -> Response<T>): Result<T?, PokeDexApiException> {
        return kotlin.runCatching {
            block.invoke()
        }.fold(
            onSuccess = {
                if (it.isSuccessful) {
                    Ok(it.body())
                } else {
                    Err(PokeDexApiResponseException(it.errorBody().toString()))
                }
            },
            onFailure = {
                Err(PokeDexApiException(it))
            }
        )
    }
}