// fun getTextLength(text: String?): Int {
//     if (text != null) {
//         return text.length
//     }
// }

fun getTextLength(text: String?) = text?.length ?: 0

fun printLength(text: String?) {
    text?.let { text ->
        println(text.length)
    }
    text?.let {
        println(it.length)
    }
}

var content: String? = "hello"

fun printUpperCase() {
    val upperCase = content!!.toUpperCase()
    println(upperCase)
}

fun main() {
    printUpperCase()
}