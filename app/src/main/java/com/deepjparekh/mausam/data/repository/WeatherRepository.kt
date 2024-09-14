package com.deepjparekh.mausam.data.repository

import com.deepjparekh.mausam.data.model.WeatherData
import kotlinx.coroutines.flow.Flow

interface WeatherRepository {
    fun getLocalWeather(): Flow<WeatherData>
}