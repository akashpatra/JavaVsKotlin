package `in`.co.trapps.jvsk.coursera.control_structures

import `in`.co.trapps.jvsk.coursera.control_structures.City.*

/**
 * @author Akash Patra
 */
enum class City {
    PARIS, AGRA, JORDAN
}

/**
 * When basic Example
 */
fun getDescription(city: City) = when (city) {
    PARIS -> "The Beautiful 'Effiel Tower'"
    AGRA -> "Wah, Taj"
    JORDAN -> "Petra"
}

/**
 * 'When' 'Any' syntax
 */
fun whenSyntax(a: Any) = when (a) {
    -1 -> "$a is Negative Value"
    is Int -> "$a is an Integer"
    is String -> "$a is a String of length ${a.length}"
    else -> "Other"
}

/**
 * 'When' with returning two data
 */
fun getCityDesc(temp: Int) {
    val (city, desc) =
            when {
                temp < 20 -> PARIS to "The Beautiful 'Effiel Tower'"
                temp in 20..35 -> AGRA to "Wah, Taj"
                else -> JORDAN to "Petra"
            }
    println("$city current temp is $temp, famous for $desc")
}

fun main(args: Array<String>) {
    println(getDescription(PARIS))
    println(whenSyntax(0.0))
    getCityDesc(5)
}