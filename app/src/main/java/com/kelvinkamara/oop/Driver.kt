package com.kelvinkamara.oop

import android.util.Log

class Driver(var name: String, credit: Int) {
//    var driverName = ""
//    protected lateinit var driverName: String
//    var driverName = name
    val car = Car()

    init {
//        driverName = name
        car.maxSpeed = 150
        car.start()
    }

    fun showDetails() {
        Log.i("MYTAG", "name of the driver is $name")
    }
}