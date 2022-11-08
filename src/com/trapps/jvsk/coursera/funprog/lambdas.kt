package com.trapps.jvsk.coursera.funprog

/**
 * @author Akash Patra
 */
fun main(args: Array<String>) {
    val list = listOf(-1, 2, -7, 20)

    // Whole Lambda inside parenthesis
    print(list.any({i: Int -> i > 0}))

    // Better way, when lambda is the last argument. Can be moved outside parenthesis
    print(list.any() {i: Int -> i > 0})

    // Also, empty parenthesis can be omitted
    print(list.any {i: Int -> i > 0})

    // Type can be omitted, if its clear from the context
    print(list.any {i -> i > 0})

    // it denotes the argument, if its only one
    print(list.any {it > 0})

    // Multiline lambda. Last line will be the result
    list.any({
        println("processing $it")
        it > 0
    })

    // Iterate over a map using Lambda
    val map = mapOf(1 to "one", 2 to "two")

    // Normal Way
    println(map)

    // Iterate using map.entry
    println(map.mapValues { entry -> "${entry.key} -> ${entry.value}"})

    // We can define two variable
    println(map.mapValues { (key, value) -> "$key -> $value"})

    // Omit the parameter if not needed
    println(map.mapValues { (_, value) -> "$value"})
}