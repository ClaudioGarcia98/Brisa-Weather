package com.example.weatherapp.domain.models

import java.time.Instant

data class WeatherReport(
    val current: CurrentWeather,
    val hourly: List<HourlyForecast>,
    val daily: List<DailyForecast>,
    val lastUpdated: Instant,
)
