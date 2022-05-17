package examples.classes

fun main() {
    val firstOrcSpec = Specialization("Ranged Damage", "Healer")
    val secondOrcSpec = Specialization("Melee Damage", "Tank")

    val firstOrc = Orc("Thrall", "Go'El", 35, firstOrcSpec)
    println(firstOrc)

    val secondOrc = Orc("Grom'mash", "HellScream", 40, secondOrcSpec)
    println(secondOrc)
}
