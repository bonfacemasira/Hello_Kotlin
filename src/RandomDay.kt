import java.util.Random

fun main(args: Array<String>) {
    if (args.isNotEmpty()) {
        println("Hello, ${args[0]}")
    } else {
        println("Hello, stranger!")
    }
    feedTheFish()
}

fun shouldChangeWater(
    day: String,
    temperature: Int= 22,
    dirty: Int = 20,
){}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")

    swim( 50, speed = "slow")
    shouldChangeWater(day, temperature = 20, dirty = 50)
}

fun swim(time: Int ,speed: String = "fast"){
    println("Swimming $speed at $time")
}

fun randomDay() : String{
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood (day: String): String {
    var food = "fasting"

    when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "fasting"
    }

    return food
}