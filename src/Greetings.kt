import java.time.LocalDateTime

fun main() {
    val current = LocalDateTime.now()
    val currentTime: Int = current.hour
    println(currentTime)
    val greeting = when {
        currentTime in 2..11 -> "morning"
        currentTime in 12..15 -> "afternoon"
        currentTime in 16..20 -> "evening"
        else -> "night"
    }

    greetingsOfDay(greeting)
}

fun greetingsOfDay(time: String) {
    println("Good $time, Kotlin!")
}