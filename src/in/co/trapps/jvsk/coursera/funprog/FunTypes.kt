package `in`.co.trapps.jvsk.coursera.funprog

/**
 * Function Type: Store Lambda in a Variable
 *
 * @author Akash Patra
 */
fun main(args: Array<String>) {
//    functionTypeEx()
//
//    useAtCollectionFun()
//
//    useAsNormalFun()
//
//    callingJavaFunType1()
//
//    callingJavaFunType2()
//
//    callingNullFunType()

//    callingNonLiteralFunType()

    invokingFunInstance()

    invokingMyHigherOrderFun()
}

fun callingNullFunType() {
    val f: (() -> Int)? = null

    if (f != null) {
        f()
    }

    // OR

    f?.invoke()
}

fun functionTypeEx() {
    // Explicitly Declaring Type
//    val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

    // Not Declaring Type
    val sum = { x: Int, y: Int -> x + y }

    println(sum(2, 3))
}

fun useAtCollectionFun() {
    val isEven = { i: Int -> i % 2 == 0 }
    val list = listOf(1, 2, 3, 4)
    println(list.any(isEven))
    println(list.filter(isEven))
}

fun useAsNormalFun() {
    val isEven = { i: Int -> i % 2 == 0 }
    println(isEven(43))
}

fun callingJavaFunType1() {
    FunTypes.postponeComputation(1000) { println(42) }
}

fun callingJavaFunType2() {
    val runnable = Runnable { println(42) }
    FunTypes.postponeComputation(1000, runnable)
}

/**
 * Instantiating a function type
 *
 * @see <a href="https://kotlinlang.org/docs/reference/lambdas.html#instantiating-a-function-type">instantiating-a-function-type</a>
 */
fun callingNonLiteralFunType() {
    val repeatFun: String.(Int) -> String = { times -> repeat(times) }
    val twoParameters: (String, Int) -> String = repeatFun // OK

    fun runTransformation(f: (String, Int) -> String): String {
        return f("hello", 3)
    }

    val result = runTransformation(twoParameters) // OK

    println("result = $result")

    val result2 = repeatFun("akash", 2)
    println("result = $result2")

    val result3 = "akash".repeatFun(2)
    println("result = $result3")
}

/**
 * Invoking a function type instance
 *
 * @see <a href="https://kotlinlang.org/docs/reference/lambdas.html#invoking-a-function-type-instance">invoking-a-function-type-instance</a>
 */
fun invokingFunInstance() {
    val stringPlus: (String, String) -> String = String::plus
    val intPlus: Int.(Int) -> Int = Int::plus

    println(stringPlus.invoke("<-", "->"))
    println(stringPlus("Hello, ", "world!"))

    println(intPlus.invoke(1, 1))
    println(intPlus(1, 2))
    println(2.intPlus(3)) // extension-like call
}


fun invokingMyHigherOrderFun() {
    print(StringBuilder("akash").doIt {
        x ->
        append("pa")
        append("tra")
        append(x)
    })
}

fun <T> T.doIt(block: T.(Int) -> Unit): T {
//    block.invoke(this, 2)
    block(2)
    return this
}