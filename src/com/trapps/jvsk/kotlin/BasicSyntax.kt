package com.trapps.jvsk.kotlin

/**
 * Basic Syntax in Kotlin
 *
 * @author Akash Patra
 */
fun main(args: Array<String>) {
    // print examples
    printExamples()

    // Variable examples
    variableExamples()

    // null examples
    nullExamples()

    // string template examples
    stringTemplateExamples()

    // casting examples
    castingExamples()

    // when examples
    whenExamples()

    // class examples
    classExamples()
}

/**
 * Print Examples
 */
fun printExamples() {
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

/**
 * Null Examples
 */
fun nullExamples() {
    println("\n**** Null Examples ****\n")
    val nullEx = NullExample()

    // init nulls to a val or var
    nullEx.initNulls()

    // Print Line to Create Space
    println()

    try {
        // access properties of null val or var
        nullEx.accessNulls()
    } catch (e: Exception) {
        println("Exception: $e")
    }
}

/**
 * String Template Examples
 */
fun stringTemplateExamples() {
    println("\n**** String Template Examples ****\n")
    var strEx = StringTemplateExample()
    strEx.showTemplate()
}

/**
 * Casting Examples
 */
fun castingExamples() {
    println("\n**** Casting Examples ****\n")
    var castingEx = CastingExample()
    castingEx.stringCast("Kotlin")
}

/**
 * When Examples
 */
fun whenExamples() {
    println("\n**** When Examples ****\n")
    var whenEx = WhenExample()
    println(whenEx.checkIntStr(8))
}

/**
 * Class Examples
 */
fun classExamples() {
    println("\n**** Class Examples ****\n")
    val classEx = ClassExample("Java")
    println(classEx.name)
    classEx.name = "Java 2"
    println(classEx.name)
}
