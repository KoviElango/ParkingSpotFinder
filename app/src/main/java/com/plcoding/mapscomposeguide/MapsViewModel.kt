package com.plcoding.mapscomposeguide

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.google.android.gms.maps.model.MapStyleOptions

class MapsViewModel: ViewModel() {
    var state by mutableStateOf(MapState())

    fun onEvent(event: MapEvent.ToggleFalloutMap) {
        when(event){
            is MapEvent.ToggleFalloutMap -> {
                state = state.copy (
                    properties = state.properties.copy(
                        mapStyleOptions = if (state.isFalloutMap) {
                            null
                        } else MapStyleOptions(MapStyle.json),
                    ),
                    isFalloutMap = !state.isFalloutMap
                )
            }
        }
    }
}