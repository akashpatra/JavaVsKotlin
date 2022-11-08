package com.trapps.jvsk.kotlin

/**
 * @author Akash Patra
 */
fun main(args: Array<String>) {
    //
//    basicFunctionTest { s -> s + "!" }

    //
    /*complexFunctionTest { s, i ->
        var temp: String = ""
        for (num in 1..i) {
            temp += s
        }
        temp
    }*/

    //
    receiverFunctionTest { plus("!") }

    //
    receiverParamFunctionTest { i ->
        var temp: String = ""
        for (num in 1..i) {
            temp += this
        }
        temp}
}

fun basicFunctionTest(function: (String) -> String) {
    val s: String = function("hello there")
    println(s)
}

fun complexFunctionTest(function: (String, Int) -> String) {
    val s: String = function("HELLO! ", 3)
    println(s)
}

fun receiverFunctionTest(function: String.() -> String){
    val s: String = "hello there".function()
    println(s)
}

fun receiverParamFunctionTest(function: String.(Int) -> String) {
    val s = "HELLO! "
    println("HELLO! ".function(3))
}