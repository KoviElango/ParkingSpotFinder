package com.plcoding.mapscomposeguide.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ParkingSpotEntity(
    val lat: Double,
    val lng: Double,
    @PrimaryKey(autoGenerate = true) val id: Int? = null
)
