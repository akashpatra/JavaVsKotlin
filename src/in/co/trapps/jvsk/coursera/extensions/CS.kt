package `in`.co.trapps.jvsk.coursera.extensions

/**
 * @author Akash Patra
 */
fun main(args: Array<String>) {
    getLastButOneChar()
}

/**
 * Import is reqd to access Extension Function, as it is different file
 */
fun getLastButOneChar() {
    val data = "abc"
    println("LastButOneChar of $data is ${data.lastButOneChar()}")
}