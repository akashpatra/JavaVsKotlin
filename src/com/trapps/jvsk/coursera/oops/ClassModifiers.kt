package com.trapps.jvsk.coursera.oops

/**
 * @author Akash Patra
 */
// enum class
enum class Color {
    BLUE, ORANGE, RED
}

fun getDescription(color: Color) {
    when (color) {
        Color.BLUE -> "cold"
        Color.ORANGE -> "mild"
        Color.RED -> "hot"
    }
}

// enum class with properties
enum class Color1(
        val r: Int, val g: Int, val b: Int
) {
    BLUE(0, 0, 255), ORANGE(255, 165, 0), RED(255, 0, 0);

    fun rgb() = (r * 256 + g) * 256 + b
}

// data class examples
