package com.deepjparekh.mausam.ui.theme

import com.deepjparekh.mausam.data.model.WeatherData

sealed interface WeatherHomeViewState {

    data object Loading : WeatherHomeViewState

    data class Success(
        val weatherData: WeatherData
    ) : WeatherHomeViewState

    data object Error : WeatherHomeViewState
}