package com.example.weatherapp.data

import android.content.Context
import androidx.room3.Room
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import com.example.weatherapp.data.dao.CurrentWeatherDao
import com.example.weatherapp.data.dao.DailyForecastDao
import com.example.weatherapp.data.dao.HourlyForecastDao
import com.example.weatherapp.data.dao.SavedLocationDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun provideWeatherDatabase(@ApplicationContext context: Context): WeatherDatabase {
        return Room.databaseBuilder<WeatherDatabase>(
            context = context,
            name = "weather.db"
        )
            .setDriver(BundledSQLiteDriver())
            .build()
    }

    @Provides
    fun provideSavedLocationDao(database: WeatherDatabase): SavedLocationDao =
        database.savedLocationDao()

    @Provides
    fun provideCurrentWeatherDao(database: WeatherDatabase): CurrentWeatherDao =
        database.currentWeatherDao()

    @Provides
    fun provideHourlyForecastDao(database: WeatherDatabase): HourlyForecastDao =
        database.hourlyForecastDao()

    @Provides
    fun provideDailyForecastDao(database: WeatherDatabase): DailyForecastDao =
        database.dailyForecastDao()
}