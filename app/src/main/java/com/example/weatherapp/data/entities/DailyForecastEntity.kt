package com.example.weatherapp.data.entities

import androidx.room3.Entity
import androidx.room3.ForeignKey
import androidx.room3.Index
import androidx.room3.PrimaryKey
import com.example.weatherapp.domain.models.Celsius
import com.example.weatherapp.domain.models.WeatherCondition
import java.time.Instant
import java.time.LocalDate

@Entity(
    tableName = "daily_forecast",
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
data class DailyForecastEntity(
    @PrimaryKey(autoGenerate = true) val dailyForecastId: Int = 0,
    val locationId: Int,
    val date: LocalDate,
    val highTemperature: Celsius,
    val lowTemperature: Celsius,
    val condition: WeatherCondition,
    val sunrise: Instant,
    val sunset: Instant,
    val precipitationChancePercent: Double,
    val moonPhase: Double,
)
