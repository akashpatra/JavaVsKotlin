package `in`.co.trapps.jvsk.coursera.properties

/**
 * @author Akash Patra
 */

class Contact(val name: String, var address: String)

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
}

class StateLogger {
    var state = false
        set(value) {
            println("State has changed: $field -> $value")
            field = value
        }
}

class LengthCounter {
    var counter: Int = 0
        private set // Change Visibility of a Setter

    fun addWord(word: String) {
        counter += word.length
    }
}


fun main(args: Array<String>) {
    // Simple Property Access
    val contact = Contact("Akash", "Bangalore")
    println("${contact.name} lives in ${contact.address}")

    // Custom Getter of a field in Rectangle Class
    val rectA = Rectangle(2, 3)
    println("Check RectA is Square or not: ${rectA.isSquare}")

    // Access fields only inside accessors
    val stateLogger = StateLogger()
    stateLogger.state = true

    // Visibility of a Setter
    val counter = LengthCounter()
    // Error while setting data
//    counter.counter =

}
