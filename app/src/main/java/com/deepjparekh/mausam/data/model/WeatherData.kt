package com.deepjparekh.mausam.data.model

data class WeatherData(
    val location: String,
    val temperature: Int, // in °C
    val condition: String,
    val highTemperature: Int,
    val lowTemperature: Int,
    val uvIndex: Int,
    val uvDescription: String,
    val sunsetTime: String,
    val sunriseTime: String,
    val windSpeed: Int, // in mph
    val windGusts: Int, // in mph
    val feelsLikeTemperature: Int, // in °C
    val precipitation: String, // in inches
    val visibility: Int, // in miles
    val humidity: Int, // in percentage
    val hourlyForecast: List<HourlyForecast>,
    val dailyForecast: List<DailyForecast>
)

data class HourlyForecast(
    val time: String,
    val temperature: Int,
    val condition: String
)

data class DailyForecast(
    val day: String,
    val highTemperature: Int,
    val lowTemperature: Int,
    val condition: String
)
