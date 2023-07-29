
fun main() {
    println("Hello World!")
    println(sum(b=2, a = 1))
}

// Top-level function
// https://kotlinlang.org/docs/reference/functions.html#function-scope

fun sum(a: Int, b: Int, c: Int = 0) = a + b + c
