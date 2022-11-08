package com.trapps.jvsk.coursera.nullability

/**
 * @author Akash Patra
 */
fun main(args: Array<String>) {
    val s = ""
    println(s as? Int)
    println(s as Int?)
}