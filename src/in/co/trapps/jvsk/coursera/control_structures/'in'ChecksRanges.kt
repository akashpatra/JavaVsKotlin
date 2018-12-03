package `in`.co.trapps.jvsk.coursera.control_structures

/**
 * @author Akash Patra
 */

/**
 * Check if the character belongs to the range or not
 */
fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit"
    in 'a'..'z', in 'A'..'Z' -> "It's a Character"
    else -> "I don't know"
}

fun inRange() {
    println("Kotlin" in "Java".."Scala")
    println("Kotlin" in setOf("Java", "Scala"))
}

/**
 * Checks Valid Identifier or not
 * My Solution to exercise :P
 */
/*fun isValidIdentifier(s: String): Boolean {
    if (s == "") return false
    if (!(s[0] in 'a'..'z' || s[0] in 'A'..'Z' || s[0] == '_')) return false
    for (c in s) {
        if (!(c in 'a'..'z' || c in 'A'..'Z' || c in '0'..'9' || c == '_')) return false
    }
    return true
}*/

/**
 * Checks Valid Identifier or not
 * Using in Ranges
 */
/*fun isValidIdentifier(s: String): Boolean {
    fun isValidCharacter(ch: Char) =
            ch == '_' || ch in '0'..'9' ||
                    ch in 'a'..'z' || ch in 'A'..'Z'

    if (s.isEmpty() || s[0] in '0'..'9') return false
    for (ch in s) {
        if (!isValidCharacter(ch)) return false
    }
    return true
}*/

/**
 * Checks Valid Identifier or not
 * Using default functions
 */
fun isValidIdentifier(s: String): Boolean {
    fun isValidCharacter(ch: Char) =
            ch == '_' || ch.isLetterOrDigit()

    if (s.isEmpty() || s[0].isDigit()) return false
    for (ch in s) {
        if (!isValidCharacter(ch)) return false
    }
    return true
}

fun main(args: Array<String>) {
    println(isLetter('c'))
    println(isLetter('%'))
    println()

    println(isNotDigit('c'))
    println()

    println("Recognize: ${recognize('C')}")
    println("Recognize: ${recognize('*')}")
    println()

    inRange()
    println()

    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}