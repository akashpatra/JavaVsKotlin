package com.trapps.jvsk.coursera.basics

/**
 * @author Akash Patra
 */
fun named() {
    println(listOf("a", "b", "c").joinToString(separator = "-", prefix = "** ", postfix = " ##"))
}

fun displaySeparator(character: Char = '*', size: Int = 10) {
    repeat(size) {
        print(character)
    }
}

fun main(args: Array<String>) {
    named()
    displaySeparator('a', 5)
    println()
    displaySeparator(size = 5, character = 'b')
    println()
    displaySeparator()
}