package com.example.weatherapp.network.api

import com.example.weatherapp.network.dto.ForecastResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiService {

    @GET("v1/forecast")
    suspend fun requestForecast(
        @Query("latitude") latitude: Double,
        @Query("longitude") longitude: Double,
        @Query("current") current: String,
        @Query("hourly") hourly: String,
        @Query("daily") daily: String,
        @Query("timezone") timezone: String,
        @Query("timeformat") timeformat: String,
        @Query("forecast_days") forecastDays: Int,
    ): ForecastResponseDto

    companion object {
        const val CURRENT_VARIABLES =
            "uv_index,temperature_2m,relative_humidity_2m,apparent_temperature,precipitation,wind_speed_10m,weather_code"
        const val HOURLY_VARIABLES =
            "temperature_2m,relative_humidity_2m,precipitation_probability,weather_code,wind_speed_10m,uv_index"
        const val DAILY_VARIABLES =
            "sunrise,sunset,weather_code,moon_phase,precipitation_probability_max,temperature_2m_max,temperature_2m_min"
    }
}
