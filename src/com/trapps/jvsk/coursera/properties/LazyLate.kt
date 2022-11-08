package com.trapps.jvsk.coursera.properties

/**
 * @author Akash Patra
 */
// [START] Lazy Property
val lazyValue: String by lazy {
    println("Computed")
    "Hello"
}
// [END] Lazy Property

// [START] lateInit Property
class MyClass {
    lateinit var lateinitVar: String

    fun initializationLogic() {
        println(this::lateinitVar.isInitialized)
        lateinitVar = "value"
        println(this::lateinitVar.isInitialized)
    }
}
// [END] lateInit Property

fun main(args: Array<String>) {

    // Testing Lazy Property
    println(lazyValue)
    println(lazyValue)

    // Testing LateInit Property
    val myClass = MyClass()
    myClass.initializationLogic()
}