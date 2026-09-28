package com.example.weatherapp.data.entities

import androidx.room3.Entity
import androidx.room3.PrimaryKey

@Entity(
    tableName = "saved_locations"
)
data class SavedLocationEntity(
    @PrimaryKey(autoGenerate = true) val savedLocationId: Int = 0,
    val longitude: Double,
    val latitude: Double,
    val name: String,
    val isFromGPS: Boolean,
)
