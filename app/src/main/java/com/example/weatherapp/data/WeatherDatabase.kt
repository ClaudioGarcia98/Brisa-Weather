package com.example.weatherapp.data

import androidx.room3.ColumnTypeConverters
import androidx.room3.Database
import androidx.room3.RoomDatabase
import com.example.weatherapp.data.dao.CurrentWeatherDao
import com.example.weatherapp.data.dao.DailyForecastDao
import com.example.weatherapp.data.dao.HourlyForecastDao
import com.example.weatherapp.data.dao.SavedLocationDao
import com.example.weatherapp.data.entities.CurrentWeatherEntity
import com.example.weatherapp.data.entities.DailyForecastEntity
import com.example.weatherapp.data.entities.HourlyForecastEntity
import com.example.weatherapp.data.entities.SavedLocationEntity
import com.example.weatherapp.util.Converters

@Database(
    entities = [
        SavedLocationEntity::class,
        CurrentWeatherEntity::class,
        HourlyForecastEntity::class,
        DailyForecastEntity::class,
    ],
    version = 1
)
@ColumnTypeConverters(Converters::class)
abstract class WeatherDatabase: RoomDatabase() {
    abstract fun savedLocationDao(): SavedLocationDao
    abstract fun currentWeatherDao(): CurrentWeatherDao
    abstract fun hourlyForecastDao(): HourlyForecastDao
    abstract fun dailyForecastDao(): DailyForecastDao
}