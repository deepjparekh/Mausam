package com.deepjparekh.mausam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.deepjparekh.mausam.ui.weatherhome.WeatherHomeScreen
import com.deepjparekh.mausam.ui.weatherhome.WeatherHomeViewModel
import com.deepjparekh.mausam.ui.theme.MausamTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: WeatherHomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         enableEdgeToEdge()

        setContent {
            MausamTheme {
                val viewState by viewModel.weatherData.collectAsStateWithLifecycle()
                WeatherHomeScreen(viewState)
            }
        }
    }
}