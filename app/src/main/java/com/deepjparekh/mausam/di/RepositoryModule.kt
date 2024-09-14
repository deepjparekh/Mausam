package com.deepjparekh.mausam.di

import com.deepjparekh.mausam.data.repository.MockWeatherRepository
import com.deepjparekh.mausam.data.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindWeatherRepository(
        mockWeatherRepository: MockWeatherRepository
    ): WeatherRepository
}