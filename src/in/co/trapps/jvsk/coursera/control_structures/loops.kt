package `in`.co.trapps.jvsk.coursera.control_structures

/**
 * @author Akash Patra
 */
fun iterateListByForLoop() {
    val list = listOf("a", "b", "c")
    for (s in list) {
        print(s)
    }
    println()
}

fun iterateListByForLoopWithIndex() {
    val list = listOf("a", "b", "c")
    for ((index, element) in list.withIndex()) {
        println("$index : $element")
    }
}

fun iterateMapByForLoop() {
    val map = mapOf(1 to "one",
                    2 to "two")
    for ((key, value) in map) {
        println("$key = $value")
    }
}

/**
 * Including UpperBound
 */
fun iterateRangesIncludingUpperBound() {
    for (i in 1..9) {
        print(i)
    }
    println()
}

/**
 * Excluding UpperBound
 */
fun iterateRangesExcludingUpperBound() {
    for (i in 1 until 10) {
        print(i)
    }
    println()
}

/**
 * Iterate Backwards with Step
 */
fun iterateBackwardsWithStep() {
    for (i in 9 downTo 1 step 2) {
        print(i)
    }
    println()
}

/**
 * Iterate String
 */
fun iterateString() {
    for (c in "abc") {
        print(c + 1)
    }
    println()
}


fun main(args: Array<String>) {
    iterateListByForLoop()
    println()

    iterateListByForLoopWithIndex()
    println()

    iterateMapByForLoop()
    println()

    iterateRangesIncludingUpperBound()
    println()

    iterateRangesExcludingUpperBound()
    println()

    iterateBackwardsWithStep()
    println()

    iterateString()
    println()
}