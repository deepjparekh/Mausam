package com.deepjparekh.mausam.ui.weatherhome

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun WeatherHomeScreen(
    viewState: WeatherHomeViewState,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.Blue)
    ) {
        val screenMessage = when (viewState) {
            is WeatherHomeViewState.Error -> {
                "Hello world, your current weather fetching failed"
            }

            is WeatherHomeViewState.Loading -> {
                "Hello world, your current weather fetching is in progress"
            }

            is WeatherHomeViewState.Success -> {
                "Hello world, your current weather is ${viewState.weatherData.temperature} degrees celcius"
            }
        }
        Text(
            text = screenMessage,
            color = Color.Yellow,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = 12.dp,
                    vertical = 60.dp
                )
        )
    }
}