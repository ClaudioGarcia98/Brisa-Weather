package com.example.weatherapp.domain.models

data class SavedLocation(
    val id: Int,
    val longitude: Double,
    val latitude: Double,
    val name: String,
    val isFromGPS: Boolean,
)
