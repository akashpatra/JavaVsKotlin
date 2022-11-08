package com.trapps.jvsk.coursera.funprog

import `in`.co.trapps.jvsk.coursera.funprog.Gender.FEMALE
import `in`.co.trapps.jvsk.coursera.funprog.Gender.MALE

/**
 * @author Akash Patra
 */
data class Hero(val name: String, val age: Int, val gender: Gender?)

enum class Gender { MALE, FEMALE }

fun main(args: Array<String>) {
    val heroes = listOf(
            Hero("The Captain", 60, MALE),
            Hero("Frenchy", 42, MALE),
            Hero("The Kid", 9, null),
            Hero("Lady Lauren", 29, FEMALE),
            Hero("First Mate", 29, MALE),
            Hero("Sir Stephen", 37, MALE))

    /* val (first, second) = heroes
             .flatMap { heroes.map { hero -> it to hero } }
             .maxBy { it.first.age - it.second.age }!!
     println(first.name)*/

    val allPossiblePairs = heroes
            .flatMap { first -> heroes.map { second -> first to second } }

//    println(allPossiblePairs)
    println(heroes.map {})
}
