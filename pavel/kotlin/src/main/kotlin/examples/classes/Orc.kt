package examples.classes

class Orc(private val firstName: String, private val lastName: String, private var age: Int) {
    private var specs: MutableList<Specialization> = mutableListOf() // ArrayList

    init {
        println("A new Orc $firstName has arrived !")
    }

    constructor(firstName: String, lastName: String, age: Int, spec: Specialization) : this(firstName, lastName, age) {
        specs.add(spec)
    }

    override fun toString(): String {
        return "Orc(firstName='$firstName', lastName='$lastName', age=$age, specs=$specs)"
    }
}
