import java.util.Calendar

fun main() {
    println("Hello, Mr Masira!!!")
    dayOfWeek()
}

fun dayOfWeek(){
    println("What day is it today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(day)
    println("${Calendar.getInstance().get(Calendar.DAY_OF_WEEK)}")
    println(when (day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Time has stopped"
    })
}