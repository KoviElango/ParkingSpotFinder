package com.plcoding.mapscomposeguide.domain.repository

import com.plcoding.mapscomposeguide.data.ParkingSpotDao
import com.plcoding.mapscomposeguide.data.toParkingSpot
import com.plcoding.mapscomposeguide.data.toParkingSpotEntity
import com.plcoding.mapscomposeguide.domain.model.ParkingSpot
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class ParkingSpotRepositoryImpl(
    private val dao: ParkingSpotDao
): ParkingSpotRepository {
    override suspend fun insertParkingSpot(spot: ParkingSpot) {
        dao.insertParkingSpot(spot.toParkingSpotEntity())
    }

    override suspend fun deleteParkingSpot(spot: ParkingSpot) {
        dao.deleteParkingSpot(spot.toParkingSpotEntity())
    }

    override fun getParkingSpots(): Flow<List<ParkingSpot>> {
        return dao.getParkingSpots().map {spots ->
            spots.map { it.toParkingSpot() }
        }
    }
}