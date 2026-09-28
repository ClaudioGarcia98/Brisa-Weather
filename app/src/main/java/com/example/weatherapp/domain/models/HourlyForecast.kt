package com.example.weatherapp.domain.models

import java.time.Instant

data class HourlyForecast(
    val time: Instant,
    val temperature: Celsius,
    val condition: WeatherCondition,
    val precipitationChancePercent: Double,
    val humidityPercent: Double,
    val windSpeed: KilometersPerHour,
    val uvIndex: Double,
)
