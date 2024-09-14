package com.deepjparekh.mausam.data.repository

import com.deepjparekh.mausam.data.model.DailyForecast
import com.deepjparekh.mausam.data.model.HourlyForecast
import com.deepjparekh.mausam.data.model.WeatherData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class MockWeatherRepository: WeatherRepository {
    override fun getLocalWeather(): Flow<WeatherData> = flowOf(mockWeatherData)

    private val mockWeatherData = WeatherData(
        location = "New York",
        temperature = 21,
        condition = "Sunny",
        highTemperature = 29,
        lowTemperature = 18,
        uvIndex = 2,
        uvDescription = "Low",
        sunsetTime = "7:05 PM",
        sunriseTime = "6:37 AM",
        windSpeed = 5,
        windGusts = 9,
        feelsLikeTemperature = 23,
        precipitation = "0\" in last 24h",
        visibility = 17,
        humidity = 75,
        hourlyForecast = listOf(
            HourlyForecast("9 AM", 21, "Sunny"),
            HourlyForecast("10 AM", 23, "Sunny"),
            HourlyForecast("11 AM", 25, "Sunny"),
            HourlyForecast("12 PM", 27, "Sunny"),
            HourlyForecast("1 PM", 28, "Sunny"),
            HourlyForecast("2 PM", 28, "Sunny")
        ),
        dailyForecast = listOf(
            DailyForecast("Today", 29, 18, "Sunny"),
            DailyForecast("Sun", 27, 18, "Sunny"),
            DailyForecast("Mon", 26, 15, "Sunny"),
            DailyForecast("Tue", 25, 17, "Partly Cloudy")
        )
    )
}