package com.example.counterapp

data class CounterModel(var count: Int)

class CounterRepository{
    private var _counter = CounterModel(0)

    fun getCounter() = _counter

    fun IncrementCounter(){
        _counter.count++
    }

    fun DecrementCounter(){
        _counter.count--
    }
}