package com.example.weatherapp.data

import androidx.room3.Embedded
import androidx.room3.Relation
import com.example.weatherapp.data.entities.CurrentWeatherEntity
import com.example.weatherapp.data.entities.DailyForecastEntity
import com.example.weatherapp.data.entities.HourlyForecastEntity
import com.example.weatherapp.data.entities.SavedLocationEntity

data class LocationWithWeather(
    @Embedded val location: SavedLocationEntity,

    @Relation(
        parentColumns = ["savedLocationId"],
        entityColumns = ["locationId"]
    )
    val currentWeather: CurrentWeatherEntity?,

    @Relation(
        parentColumns = ["savedLocationId"],
        entityColumns = ["locationId"]
    )
    val hourlyForecast: List<HourlyForecastEntity>,

    @Relation(
        parentColumns = ["savedLocationId"],
        entityColumns = ["locationId"]
    )
    val dailyForecast: List<DailyForecastEntity>,
)
