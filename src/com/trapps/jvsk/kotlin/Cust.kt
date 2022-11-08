package com.trapps.jvsk.kotlin

/**
 * @author Akash Patra
 */
data class Cust(val name: String, val lastName: String)

fun main(args: Array<String>) {
    val cust = Cust("akash", "patra")

    println(cust.name)
    println(cust.lastName)

    val (a, b) = cust
    println(a)
    println(b)
}