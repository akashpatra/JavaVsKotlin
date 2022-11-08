package com.trapps.jvsk.coursera.funprog

/**
 * @author Akash Patra
 */
class Person(val name: String, val age: Int) {
    fun isOlder(ageLimit: Int) = age > ageLimit
}

fun main(args: Array<String>) {

    memberRefEx()

    functionRefEx()

    nonBoundRefEx()

    boundRefEx()
}

fun memberRefEx() {
    val people = listOf(
            Person("Akash", 30),
            Person("Avash", 26),
            Person("Prakash", 58))

    // find max by age using lambda
//    val person = people.maxBy { it.age }

    // find max by age using Member Ref
//    val person = people.maxBy(Person::age)

//    println("Maximum Age is : ${person?.name}")
}

fun functionRefEx() {
    fun isEven(i: Int) = i % 2 == 0

    // 1st Way
//    val predicate = {i: Int -> isEven(i)}

    // 2nd Way
    val predicate = ::isEven

    println("Function Ref Ex : ${predicate(2)}")
}

/**
 * Here the lambda is not bound to a object ref
 */
fun nonBoundRefEx() {
    // Non - Bound Ref
//    val agePredicate = Person::isOlder

    // Declaring with Function Type
//    val agePredicate: (Person, Int) -> Boolean = Person::isOlder

    // Declaring with Function Type & Lambda
    val agePredicate: (Person, Int) -> Boolean = { person, ageLimit -> person.isOlder(ageLimit) }

    val alice = Person("Alice", 29)
    println(agePredicate(alice, 21))
}

/**
 * Here the lambda is bound to a object ref
 */
fun boundRefEx() {
    val alice = Person("Alice", 29)

    // Bound Ref
//    val agePredicate = alice::isOlder

    // Declaring with Function Type
//    val agePredicate: (Int) -> Boolean = alice::isOlder

    // Declaring with Function Type & Lambda
    val agePredicate: (Int) -> Boolean = { ageLimit -> alice.isOlder(ageLimit) }

    println(agePredicate(21))
}