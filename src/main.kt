//problem 8 is in my KotlinProblem2 repository

fun main() {
    val Steps = 4000
    val caloriesBurned = PEDOMETERcalories(Steps);
    println("Walking $Steps steps burns $caloriesBurned calories")

    val timeSpentToday = 300
    val timeSpentYesterday = 200
    val isTodayGreater = compare(timeSpentToday, timeSpentYesterday)
    println("You spent $timeSpentToday minutes on your phone today and $timeSpentYesterday minutes on your phone yesterday. Get off that dang phone and get a life.")


    cityPrint("Ankara", 27, 31, 82)

    cityPrint("Tokyo", 32, 36, 10)

    cityPrint("Cape Town", 59, 64, 2)

    cityPrint("Guatemala City", 50, 55, 7)
}

fun cityPrint(name: String, low: Int, high: Int, rain: Int){
    println("City: $name")
    println("Low temperature: $low, High temperature: $high")
    println("Chance of rain: $rain%")
    println()
}

fun PEDOMETERcalories(Steps: Int): Double {
    val BURNEDperStep = 0.04
    val Totalburned = Steps * BURNEDperStep
    return Totalburned
}

fun compare(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    if (timeSpentToday > timeSpentYesterday){
        return true;
    }else{
        return false
    }
}