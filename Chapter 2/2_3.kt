import kotlin.math.max

fun largerNumber(num1: Int, num2: Int): Int {
    return max(num1, num2)
}

fun smallerNumber(num1: Int, num2: Int) = if (num1 <= num2) {
    num1
} else {
    num2
}

fun main() {
    val a = 10
    var b: Int = 10
    println("a = " + a)
    b = b * 10
    println("b = " + b)
    println("The larger number is " + largerNumber(a, b))
    println("The smaller number is " + smallerNumber(a, b))
    
}