package com.muratguzel.hiltusagekotlin.di

import com.muratguzel.hiltusagekotlin.Adres
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideAdres() : Adres {
        return Adres("kadıköy / istanbul")

    }
}