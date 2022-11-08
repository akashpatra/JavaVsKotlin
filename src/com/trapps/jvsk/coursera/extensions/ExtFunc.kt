package com.trapps.jvsk.coursera.extensions

/**
 * @author Akash Patra
 */
fun String.lastButOneChar() = get(length - 2)

/**
 * No Import is reqd to access Extension Function, as it is same file
 */
fun main(args: Array<String>) {
    val data = "abc"
    println("LastButOneChar of $data is ${data.lastButOneChar()}")
}