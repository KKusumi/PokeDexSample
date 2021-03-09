package com.example.pokedexsample

import android.app.Application
import com.example.pokedexsample.di.navigationModule
import com.example.pokedexsample.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(
                listOf(
                    viewModelModule, navigationModule
                )
            )
        }
    }
}