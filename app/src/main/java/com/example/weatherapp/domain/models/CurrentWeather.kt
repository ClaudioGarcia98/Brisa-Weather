package com.example.weatherapp.domain.models

import java.time.Instant

data class CurrentWeather(
    val currentTemperature: Celsius,
    val feelsLike: Celsius,
    val condition: WeatherCondition,
    val precipitationMm: Double,
    val humidityPercent: Double,
    val windSpeed: KilometersPerHour,
    val uvIndex: Double,
    val sunrise: Instant,
    val sunset: Instant,
)

@JvmInline
value class Celsius(val value: Double)

@JvmInline
value class KilometersPerHour(val value: Double)


