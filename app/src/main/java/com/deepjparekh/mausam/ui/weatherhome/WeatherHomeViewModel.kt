package com.deepjparekh.mausam.ui.weatherhome

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.deepjparekh.mausam.data.repository.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class WeatherHomeViewModel @Inject constructor(
    repository: WeatherRepository
) : ViewModel() {

    val weatherData: StateFlow<WeatherHomeViewState> = repository.getLocalWeather()
        .fold(
            onSuccess = { weatherData -> weatherData.map { WeatherHomeViewState.Success(it) } },
            onFailure = { flowOf(WeatherHomeViewState.Error) }
        )
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5_000L),
            initialValue = WeatherHomeViewState.Loading
        )
}