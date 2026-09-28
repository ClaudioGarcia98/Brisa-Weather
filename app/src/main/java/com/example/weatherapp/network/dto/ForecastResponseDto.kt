package com.example.weatherapp.network.dto

import kotlinx.serialization.Serializable

@Serializable
data class ForecastResponseDto(
    val current: CurrentDto,
    val hourly: HourlyDto,
    val daily: DailyDto,
)