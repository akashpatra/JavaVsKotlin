package `in`.co.trapps.jvsk.coursera.nullability

/**
 * @author Akash Patra
 */
fun main(args: Array<String>) {
    val s1: String? = null
    val s2: String? = ""
    s1.isEmptyOrNull() eq true
    s2.isEmptyOrNull() eq true

    val s3 = "   "
    s3.isEmptyOrNull() eq false
}
fun String?.isEmptyOrNull() = this?.isEmpty() ?: true

infix fun <T> T.eq(other: T) {
    if (this == other) println("OK")
    else println("Error: $this != $other")
}