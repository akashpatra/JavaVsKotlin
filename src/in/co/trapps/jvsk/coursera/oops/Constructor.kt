package `in`.co.trapps.jvsk.coursera.oops

/**
 * @author Akash Patra
 */
// Primary Constructor Example
class Person(val name: String)

fun main(args: Array<String>) {
    val person = Person("Akash")
    println("Name is ${person.name}")
}

// Full Constructor Example
class Person2(name: String) {
    val name: String

    init {
        this.name = name
    }
}

// Visibility of Constructor
class InternalComponent internal constructor(name: String)

// Secondary Constructor Example
class Rectangle(val height: Int, val width: Int) {
    constructor(side: Int) : this(side, side)
}

// Same Syntax for extends and implements
interface Base
class BaseImpl : Base

open class Parent
class Child : Parent()

// Calling a constructor of parent class
open class Parent1 (val name: String)
class Child1(name: String) : Parent1(name)

open class Parent2 (val name: String)
class Child2 : Parent1 {
    constructor(name: String, param: Int) : super(name)
}