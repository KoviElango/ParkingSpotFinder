package com.plcoding.mapscomposeguide

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

sealed class MapEvent {
    object ToggleFalloutMap: ViewModel(){
        var state by mutableStateOf(MapState())

    }
}