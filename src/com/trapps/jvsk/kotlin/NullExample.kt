package com.trapps.jvsk.kotlin

/**
 * @author Akash Patra
 */
class NullExample {

    /**
     * No Initialization
     */
    fun initNulls() {
        val firstName: String? = null
        var lastName: String?
        lastName = null
        println("Allow Nulls -> FirstName: $firstName , LastName: $lastName")
    }

    /**
     * Access Null Ref
     */
    fun accessNulls() {
        val name: String? = null

        // Safe way to avoid NPE
        val length = name?.length

        println("Access Nulls -> Name: $name , Length of Name: $length")

        // To get NPE
        val length2 = name!!.length
    }
}