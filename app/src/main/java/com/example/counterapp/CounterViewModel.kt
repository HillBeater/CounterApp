package com.example.counterapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel() : ViewModel() {
    private val _repository: CounterRepository = CounterRepository()
    private val _count = mutableStateOf(_repository.getCounter().count)

    // Expose the count as an immutable state
    val count: MutableState<Int> = _count

    fun Increment(){
        _repository.IncrementCounter()
        _count.value = _repository.getCounter().count
    }

    fun Decrement(){
        _repository.DecrementCounter()
        _count.value = _repository.getCounter().count
    }
}