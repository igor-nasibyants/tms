package examples

import java.lang.IllegalArgumentException

fun main() {
    println("What's your name?")
    val name = readln()
    println("Hello, $name!")
    println("Enter a color : Red, Green or Blue")
    println(transform(readln()))
}

fun transform(color: String): Any {
    return when (color) {
        "Red" -> "Your color is Red"
        "Green" -> "Your color is Green"
        "Blue" -> "Your color is Blue, just like you"
        else -> throw IllegalArgumentException("Invalid color param value")
    }
}
