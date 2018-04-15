package `in`.co.trapps.jvsk.kotlin

/**
 * @author Akash Patra
 */
class CastingExample {

    /**
     * Check String type and then find String length
     *
     * @param name
     */
    fun stringCast(name: Any) {
        if (name is String) {
            val length = name.length
            println("It is a String of length: $length")
        }
    }
}