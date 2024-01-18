package com.kelvinkamara.oop

import android.util.Log

class Car {
    var maxSpeed = 30
    fun start() {
        Log.i("MYTAG", "Car is starting...")
        Log.i("MYTAG", "Max speed is $maxSpeed")
    }
}