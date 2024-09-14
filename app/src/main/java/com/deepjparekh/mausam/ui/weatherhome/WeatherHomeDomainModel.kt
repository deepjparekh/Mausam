package com.deepjparekh.mausam.ui.weatherhome

import androidx.annotation.IntegerRes

interface WeatherHomeDomainModel

data class WeatherSummaryDomainModel(
    val locationName: String,
    val temperature: String,
    val condition: String,
    val temperatureSummary: String,
): WeatherHomeDomainModel

data class HourlyForecastDomainModel(
    val headerTitle: String,
    @IntegerRes val headerIcon: Int,
    val fullSummary: String,
    val hourlyForecastItems: List<HourlyForecastItemDomainModel>,
): WeatherHomeDomainModel

data class HourlyForecastItemDomainModel(
    val title: String,
    @IntegerRes var weatherIcon: Int,
    val temperature: String,
)

data class DailyForecastDomainModel(
    val headerTitle: String,
    @IntegerRes val headerIcon: Int,
    val dailyForecastItems: List<DailyForecastItemDomainModel>,
): WeatherHomeDomainModel

data class DailyForecastItemDomainModel(
    val title: String,
    @IntegerRes var weatherIcon: Int,
    val lowTemperature: String,
    val highTemperature: String,
)

data class AirQualityDomainModel(
    val headerTitle: String,
    @IntegerRes val headerIcon: Int,
    val airQualityIndex: Int,
    val airQualityCondition: String,
    val airQualityDescription: String,
): WeatherHomeDomainModel

data class WindDomainModel(
    val headerTitle: String,
    @IntegerRes val headerIcon: Int,
    val windSpeed: Int,
    val gustSpeed: Int,
    // todo: change to enum
    val windDirection: String,
): WeatherHomeDomainModel

data class SunDetailsDomainModel(
    val headerTitle: String,
    @IntegerRes val headerIcon: Int,
    val sunsetInfo: String,
    val sunriseInfo: String,
): WeatherHomeDomainModel

data class FeelsLikeDomainModel(
    val headerTitle: String,
    @IntegerRes val headerIcon: Int,
    val temperature: String,
    val condition: String
): WeatherHomeDomainModel

data class PrecipitationDomainModel(
    val headerTitle: String,
    @IntegerRes val headerIcon: Int,
    val precipitation: String,
    val description: String
): WeatherHomeDomainModel

data class VisibilityDomainModel(
    val headerTitle: String,
    @IntegerRes val headerIcon: Int,
    val visibility: String,
    val description: String
): WeatherHomeDomainModel

data class HumidityDomainModel(
    val headerTitle: String,
    @IntegerRes val headerIcon: Int,
    val humidity: String,
    val description: String
): WeatherHomeDomainModel

data class PressureDomainModel(
    val headerTitle: String,
    @IntegerRes val headerIcon: Int,
    val pressure: String,
): WeatherHomeDomainModel