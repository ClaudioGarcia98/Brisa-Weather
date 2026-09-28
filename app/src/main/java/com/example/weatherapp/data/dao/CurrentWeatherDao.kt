package com.example.weatherapp.data.dao

import androidx.room3.Dao
import androidx.room3.Query
import androidx.room3.Upsert
import com.example.weatherapp.data.entities.CurrentWeatherEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface CurrentWeatherDao {

    @Upsert
    suspend fun upsert(currentWeather: CurrentWeatherEntity)

    @Query(value = "SELECT * FROM current_weather WHERE locationId = :locationId")
    fun getCurrentWeather(locationId: Int): Flow<CurrentWeatherEntity?>
}