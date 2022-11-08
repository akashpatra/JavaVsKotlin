package com.trapps.jvsk.kotlin

/**
 * @author Akash Patra
 */
class VariableExample {

    val x = 1
    var y = 2

    /**
     * Read Only Variables (val) Initialization
     */
    fun initReadOnlyVariable() {
        val a = 'A' // `Char` type is inferred
        val b: Int = a.toInt() // Char to Int immediate assignment
        val c: String = "Kotlin" // immediate assignment
        println("Read Only Variable -> a: $a, b: $b, c: $c")
    }

    /**
     * Mutable Variables (var) Initialization
     */
    fun initMutableVariable() {
        var a = 'A' // `Char` type is inferred
        var b: Int = a.toInt() // Char to Int immediate assignment
        var c = "Kotlin" // immediate assignment
        println("Mutable Variable -> a: $a, b: $b, c: $c")

        a = 'B'
        b = a.toInt()
        c = "Kotlin is evolving"
        println("Mutable Variable (After Change) -> a: $a, b: $b, c: $c")
    }

    /**
     * Access Instance Variable (val & var)
     */
    fun accessInstanceVariable() {
        println("Instance Variable -> x: $x, y: $y")
        y += 1 // Increment Mutable Variable
        println("Instance Variable (After Change )-> x: $x, y: $y")
    }
}