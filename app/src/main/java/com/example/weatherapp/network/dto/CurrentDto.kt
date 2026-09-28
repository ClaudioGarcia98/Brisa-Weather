package com.example.weatherapp.network.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CurrentDto(
    val time: Long,
    val interval: Int,
    val precipitation: Double,
    @SerialName("uv_index") val uvIndex: Double,
    @SerialName("temperature_2m") val temperature2m: Double,
    @SerialName("relative_humidity_2m") val relativeHumidity2m: Double,
    @SerialName("apparent_temperature") val apparentTemperature: Double,
    @SerialName("wind_speed_10m") val windSpeed10m: Double,
    @SerialName("weather_code") val weatherCode: Int,
)