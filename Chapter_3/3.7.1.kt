fun main() {
    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
    val choose = 4
    if (choose == 1) {
        val builder = StringBuilder()
        builder.append("Start eating fruits.\n")
        for (fruit in list) {
            builder.append(fruit).append("\n")
        }
        builder.append("Ate all fruits.\n")
        val result = builder.toString()
        println(result)
    } else if (choose == 2) {
        val result = with(StringBuilder()) {
            append("Start eating fruits.\n")
            for (fruit in list) {
                append(fruit).append("\n")
            }
            append("Ate all fruits.\n")
            toString()
        }
        println(result)
    } else if (choose == 3) {
        val result = StringBuilder().run {
            append("Start eating fruits.\n")
            for (fruit in list) {
                append(fruit).append("\n")
            }
            append("Ate all fruits.\n")
            toString()
        }
        println(result)
    } else if (choose == 4) {
        val result = StringBuilder().apply {
            append("Start eating fruits.\n")
            for (fruit in list) {
                append(fruit).append("\n")
            }
            append("Ate all fruits.\n")
        }
        println(result.toString())
    }
}