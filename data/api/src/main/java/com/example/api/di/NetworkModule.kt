package com.example.api.di

import com.example.api.api.PokeApi
import com.example.api.client.PokeApiClient
import com.example.api.client.PokeApiClientImpl
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val networkModule = module {
    single {
        Retrofit.Builder()
            .baseUrl("https://pokeapi.co/api/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    single {
        (get() as Retrofit).create(PokeApi::class.java)
    }
    single {
        PokeApiClientImpl(pokeApi = get()) as PokeApiClient
    }
}