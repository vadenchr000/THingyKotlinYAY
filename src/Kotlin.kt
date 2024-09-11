fun main(){
    val celToFah: (Double) -> Double = {
        (9.0 / 5.0) * it + 32
    }

    val kelToCel: (Double) -> Double = {
        it + 273.15
    }

    val fishToKel: (Double) -> Double = {
        (5.0 / 9.0) * (it - 32) * 273.15
    }

    printFinalTemperature(27.0, "Celsius", "Fahrenheit", celToFah)
    printFinalTemperature(27.0, "Kelvin", "Celsius"){
        IT + 273.15
    }
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit:  String,
    conversionFormula: (Double) -> Double
){
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement))
    println("$initialMeasurement degress $initialUnit is $finalMeasurement degrees $finalUnit.")
}