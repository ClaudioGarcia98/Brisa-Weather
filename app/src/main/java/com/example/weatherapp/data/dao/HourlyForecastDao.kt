package com.example.weatherapp.data.dao

import androidx.room3.Dao
import androidx.room3.Insert
import androidx.room3.Query
import androidx.room3.Transaction
import com.example.weatherapp.data.entities.HourlyForecastEntity
import kotlinx.coroutines.flow.Flow

@Dao
abstract class HourlyForecastDao {

    @Insert
    protected abstract suspend fun insertHourlyForecast(forecasts: List<HourlyForecastEntity>)

    @Query("DELETE FROM hourly_forecast WHERE locationId = :locationId")
    protected abstract suspend fun deleteHourlyForecast(locationId: Int)

    @Query("SELECT * FROM hourly_forecast WHERE locationId = :locationId ORDER BY time ASC")
    abstract fun getHourlyForecast(locationId: Int): Flow<List<HourlyForecastEntity>>

    @Transaction
    open suspend fun refreshHourlyForecast(locationId: Int, forecasts: List<HourlyForecastEntity>){
        deleteHourlyForecast(locationId)
        insertHourlyForecast(forecasts)
    }

}