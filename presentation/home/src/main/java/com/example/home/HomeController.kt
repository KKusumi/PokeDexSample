package com.example.home

import com.airbnb.epoxy.TypedEpoxyController
import com.example.model.response.PokemonListResponse

class HomeController: TypedEpoxyController<PokemonListResponse>() {

    override fun buildModels(data: PokemonListResponse?) {
        TODO("Not yet implemented")
    }
}