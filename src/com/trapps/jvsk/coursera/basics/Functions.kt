package com.trapps.jvsk.coursera.basics

/**
 * @author Akash Patra
 */
fun max(a: Int, b: Int): Int {
    return if (a < b) a else b
}

// In this case, return type is inferred
fun maxWithExpressionBody (a: Int, b: Int) = if (a < b) a else b
