package com.example.weatherapp.util

import androidx.room3.ColumnTypeConverter
import java.time.Instant
import java.time.LocalDate

class Converters {

    @ColumnTypeConverter
    fun fromInstant(value: Instant?): Long? {
        return value?.toEpochMilli()
    }

    @ColumnTypeConverter
    fun toInstant(value: Long?): Instant? {
     return value?.let { Instant.ofEpochMilli(it) }
    }

    @ColumnTypeConverter
    fun fromLocalDate(value: LocalDate?): String? {
        return value?.toString()
    }

    @ColumnTypeConverter
    fun toLocalDate(value: String?): LocalDate? {
        return value?.let { LocalDate.parse(it) }
    }
}