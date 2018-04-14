package `in`.co.trapps.jvsk.kotlin

/**
 * Basic Syntax in Kotlin
 *
 * @author Akash Patra
 */
fun main(args: Array<String>) {
    // print example
    print()

    // Variable Examples
    variableExamples()
}

/**
 * Print
 */
fun print() {
    print("Welcome ")
    println("to Kotlin World !!!")
}

/**
 * Variable Examples
 */
fun variableExamples() {
    println("\n**** Variable Examples ****\n")
    var variableEx = VariableExample()

    // read only variable initialization example
    variableEx.initReadOnlyVariable()

    // Print Line to Create Space
    println()

    // mutable variable initialization example
    variableEx.initMutableVariable()

    // Print Line to Create Space
    println()

    // instance variable example
    variableEx.accessInstanceVariable()
}