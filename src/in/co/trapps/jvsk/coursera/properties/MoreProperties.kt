package `in`.co.trapps.jvsk.coursera.properties

/**
 * @author Akash Patra
 */
// [START] Property in Interface
interface User {
    val nickName: String
}

class FacebookUser(val accountId: String) : User {
    override val nickName: String = getFacebookName(accountId)
}

class SubscribingUser(val email: String) : User {
    override val nickName: String
        get() = email.substringBefore("@")
}

fun getFacebookName(accountId: String): String {
    return "Ramesh"
}
// [END] Property in Interface


// [START] Open Property can't be used in smart casts
interface Session {
    val user: User
}

fun analyzeUserSession(session: Session) {
    val user = session.user
    if (user is FacebookUser) {
        println(user.accountId)
    }
}
// [END] Open Property can't be used in smart casts


// [START] Extension Properties
val String.lastIndex: Int
    get() = this.length - 1

val String.indices: IntRange
    get() = 0..lastIndex
// [END] Extension Properties


// [START] Mutable Extension Properties
var StringBuilder.lastChar: Char
    get() = get(this.length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

val sb = StringBuilder("Kotlin?")
//sb.lastChar = '!'
// [END] Mutable Extension Properties