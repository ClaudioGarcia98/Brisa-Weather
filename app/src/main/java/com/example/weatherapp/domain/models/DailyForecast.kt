package com.example.weatherapp.domain.models

import java.time.Instant
import java.time.LocalDate

data class DailyForecast(
    val date: LocalDate,
    val highTemperature: Celsius,
    val lowTemperature: Celsius,
    val condition: WeatherCondition,
    val sunrise: Instant,
    val sunset: Instant,
    val precipitationChancePercent: Double,
    val moonPhase: Double,
)
