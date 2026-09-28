package com.example.weatherapp.data.dao

import androidx.room3.Dao
import androidx.room3.Delete
import androidx.room3.Query
import androidx.room3.Upsert
import com.example.weatherapp.data.LocationWithWeather
import com.example.weatherapp.data.entities.SavedLocationEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface SavedLocationDao {

    @Upsert
    suspend fun upsert(savedLocation: SavedLocationEntity)

    @Delete
    suspend fun delete(savedLocation: SavedLocationEntity)

    @Query(value = "SELECT * FROM saved_locations")
    fun getAllLocations(): Flow<List<LocationWithWeather>>

    @Query("SELECT * FROM saved_locations WHERE savedLocationId = :locationId")
    fun getSavedLocationFlow(locationId: Int): Flow<LocationWithWeather?>

}