fun main (){

    for (i in 1..10)
    {
        val fortune = getFortuneCookie(getBirthday())
        println("\nYour fortune is: $fortune")

        if (fortune.contains("Take it easy and enjoy life!")) break
    }
}

fun getFortuneCookie(birthday: Int): String {
    val fortunes = listOf(
    "You will have a great day!",
    "Things will go well for you today.",
    "Enjoy a wonderful day of success.",
    "Be humble and all will turn out well.",
    "Today is a good day for exercising restraint.",
    "Take it easy and enjoy life!",
    "Treasure your friends because they are your greatest fortune.",)

    return when {
        birthday == 28 || birthday == 31 -> "Take it easy and enjoy life!"
        birthday <= 7 -> "Enjoy a wonderful day of success."
        else -> fortunes[birthday % fortunes.size]
    }
}

fun getBirthday(): Int{
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull()?:1
}