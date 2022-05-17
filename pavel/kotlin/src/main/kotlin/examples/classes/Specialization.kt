package examples.classes

class Specialization(private val firstSpec: String, private val secondSpec: String) {
    override fun toString(): String {
        return "Specialization(firstSpec='$firstSpec', secondSpec='$secondSpec')"
    }
}
