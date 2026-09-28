package com.example.weatherapp.data.dao

import androidx.room3.Dao
import androidx.room3.Insert
import androidx.room3.Query
import androidx.room3.Transaction
import com.example.weatherapp.data.entities.DailyForecastEntity
import kotlinx.coroutines.flow.Flow

@Dao
abstract class DailyForecastDao {

    @Insert
    protected abstract suspend fun insertDailyForecast(forecasts: List<DailyForecastEntity>)

    @Query("DELETE FROM daily_forecast WHERE locationId = :locationId")
    protected abstract suspend fun deleteDailyForecast(locationId: Int)

    @Query("SELECT * FROM daily_forecast WHERE locationId = :locationId ORDER BY date ASC")
    abstract fun getDailyForecast(locationId: Int): Flow<List<DailyForecastEntity>>

    @Transaction
    open suspend fun refreshDailyForecast(locationId: Int, forecasts: List<DailyForecastEntity>){
        deleteDailyForecast(locationId)
        insertDailyForecast(forecasts)
    }

}