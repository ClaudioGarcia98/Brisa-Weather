package com.example.weatherapp.network.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HourlyDto(
    val time: List<Long>,
    @SerialName("temperature_2m") val temperature2m: List<Double>,
    @SerialName("relative_humidity_2m") val relativeHumidity2m: List<Double>,
    @SerialName("precipitation_probability") val precipitationProbability: List<Double>,
    @SerialName("weather_code") val weatherCode: List<Int>,
    @SerialName("wind_speed_10m") val windSpeed10m: List<Double>,
    @SerialName("uv_index") val uvIndex: List<Double>,
)
