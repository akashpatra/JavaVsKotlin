package `in`.co.trapps.jvsk.kotlin

/**
 * @author Akash Patra
 */
class WhenExample {
    /**
     * Checks the Object passed is 1 or 5 or String or others
     *
     * @param name
     * @return result
     */
    fun checkIntStr(name: Any): String =
            when (name) {
                1, 5 -> "1 or 5"
                is Int -> "Not 1 or 5"
                is String -> "String"
                else -> "Not Int or String"
            }
}