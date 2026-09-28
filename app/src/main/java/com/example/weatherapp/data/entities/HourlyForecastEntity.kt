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
    tableName = "hourly_forecast",
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
data class HourlyForecastEntity(
    @PrimaryKey(autoGenerate = true) val hourlyForecastId: Int = 0,
    val locationId: Int,
    val time: Instant,
    val temperature: Celsius,
    val condition: WeatherCondition,
    val precipitationChancePercent: Double,
    val humidityPercent: Double,
    val windSpeed: KilometersPerHour,
    val uvIndex: Double,
)