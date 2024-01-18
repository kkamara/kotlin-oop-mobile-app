package com.kelvinkamara.oop

import android.util.Log

class Driver(var name: String, credit: Int) {
    val car = Car()

    init {
        car.maxSpeed = 150
        car.start()
    }

    fun showDetails() {
        Log.i("MYTAG", "name of the driver is $name")
    }
}