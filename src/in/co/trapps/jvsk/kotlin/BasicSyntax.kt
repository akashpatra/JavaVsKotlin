package `in`.co.trapps.jvsk.kotlin

/**
 * Basic Syntax in Kotlin
 *
 * @author Akash Patra
 */
fun main(args: Array<String>) {
    // print example
    print()

    // variable initialization example
    initVariable()
}

/**
 * Print Example
 */
fun print() {
    print("Welcome ")
    println("to Kotlin World !!!")
}

/**
 * Variables Initialization Example
 */
fun initVariable() {
    val a = 'A' // `Char` type is inferred
    val b: Int = a.toInt() // Char to Int immediate assignment
    val c: String = "Kotlin" // immediate assignment
    println("a: $a, b: $b, c: $c")
}
