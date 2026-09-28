package com.example.weatherapp.data.entities

import androidx.room3.Entity
import androidx.room3.ForeignKey
import androidx.room3.Index
import androidx.room3.PrimaryKey
import com.example.weatherapp.domain.models.Celsius
import com.example.weatherapp.domain.models.KilometersPerHour
import com.example.weatherapp.domain.models.WeatherCondition
import java.time.Instant

@Entity(
    tableName = "current_weather",
    foreignKeys = [
        ForeignKey(
            entity = SavedLocationEntity::class,
            parentColumns = ["savedLocationId"],
            childColumns = ["locationId"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [Index("locationId")]
)
data class CurrentWeatherEntity(

    @PrimaryKey(autoGenerate = true) val currentWeatherId: Int = 0,
    val locationId: Int,
    val currentTemperature: Celsius,
    val feelsLike: Celsius,
    val condition: WeatherCondition,
    val precipitationMm: Double,
    val humidityPercent: Double,
    val windSpeed: KilometersPerHour,
    val uvIndex: Double,
    val sunrise: Instant,
    val sunset: Instant,
)