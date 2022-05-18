package examples

fun main() {
    val a = listOf(1, 2, 3, 4, 5)
    a.forEach { x -> print(x) }
    println()
    println(a.map { x -> x * 2 })
    println("Even numbers : " + a.filter { x -> x % 2 == 0 })
    println("Sum of all numbers is : " + a.reduce { sum, x -> sum + x })

    println(a.any { it > 10 }) // один из элементов удовлетворяет условию
    println(a.all { it < 10 }) // все элементы удовлетворяют условию

    val b = listOf(1, 4, -16, 9, -3)
    val (positive, negative) = b.partition { it > 0 }

    println("Positive numbers :$positive")
    println("Negative numbers :$negative")

    listOf("Java", "Kotlin", "Groovy", "Php")
        .groupBy { it.length }
        .toSortedMap()
        .forEach { x -> print(x) }

    println()

    val fruits = listOf("банан", "авокадо", "яблоко", "киви")
    fruits
        .filter { it.startsWith("а") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }
}
