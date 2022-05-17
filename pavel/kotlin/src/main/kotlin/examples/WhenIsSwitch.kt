package examples

fun main() {
    testWhen(1)
    testWhen(3)
    testWhen("Jingle Bells")
    testWhen(15)
}

fun testWhen(input: Any) {
    when (input) {
        1 -> println("Number One")
        2 -> println("Number Two")
        in 10..20 -> println("Number from 10 to 20")
        is String -> println("This is a string and it's length is : ${input.length}")
        else -> println("Jakarta")
    }
}
