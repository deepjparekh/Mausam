package com.deepjparekh.mausam.ui.weatherhome

import com.deepjparekh.mausam.data.model.WeatherData

sealed interface WeatherHomeViewState {

    data object Loading : WeatherHomeViewState

    data class Success(
        val weatherData: WeatherData
    ) : WeatherHomeViewState

    data object Error : WeatherHomeViewState
}