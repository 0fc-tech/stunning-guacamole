package com.eniecole.mod4statevm

import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class CounterVM : ViewModel() {
    private var _stateCounter = MutableStateFlow(0)
    val stateCounter : StateFlow<Int> = _stateCounter
    fun inc(){
        _stateCounter.value += 1
    }
    fun dec(){
        _stateCounter.value -= 1
    }
}