package com.trapps.jvsk.kotlin

/**
 * @author Akash Patra
 */
class StringTemplateExample {

    /**
     * String Template
     */
    fun showTemplate() {
        var a = 20
        //
        val t1 = "Amy age is $a"

        println(t1)

        a = 25
        val t2 = "${t1.replace("is", "was")}, now is $a."

        println(t2)
    }
}

