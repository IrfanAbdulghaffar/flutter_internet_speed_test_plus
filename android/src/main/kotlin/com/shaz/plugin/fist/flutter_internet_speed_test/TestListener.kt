package com.shaz.plugin.fist.flutter_internet_speed_test_plus

interface TestListener {

    fun onComplete(transferRate: Double)

    fun onError(speedTestError: String, errorMessage: String)

    fun onProgress(percent: Double, transferRate: Double)

}

