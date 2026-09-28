package com.example.weatherapp.network.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DailyDto(
    val time: List<Long>,
    val sunrise: List<Long>,
    val sunset: List<Long>,
    @SerialName("weather_code") val weatherCode: List<Int>,
    @SerialName("moon_phase") val moonPhase: List<Double>,
    @SerialName("precipitation_probability_max") val precipitationProbabilityMax: List<Double>,
    @SerialName("temperature_2m_max") val temperature2mMax: List<Double>,
    @SerialName("temperature_2m_min") val temperature2mMin: List<Double>,
)
