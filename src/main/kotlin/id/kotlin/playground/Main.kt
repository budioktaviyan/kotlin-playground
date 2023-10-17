package id.kotlin.playground

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
  runBlocking {
    println("Weather forecast")
    println(getWeatherReport())
    println("Have a good day!")
  }
}

suspend fun getWeatherReport() = coroutineScope {
  val forecast = async { getForecast() }
  val temperature = async { getTemperature() }
  "${forecast.await()} ${temperature.await()}"
}

suspend fun getForecast(): String {
  delay(1000)
  return "Sunny"
}

suspend fun getTemperature(): String {
  delay(1000)
  return "30\u00b0C"
}