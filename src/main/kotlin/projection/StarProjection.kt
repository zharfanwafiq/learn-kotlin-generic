package projection

fun main() {
    starProjection()
}

fun starProjection() {
    val arrayInt = arrayOf(1, 2, 3, 4, 5, 6)
    val arrayString = arrayOf("Zharfan", "Wafiq", "Ganteng")
    displayLength(arrayInt)
    displayLength(arrayString)
}

fun displayLength(array: Array<*>) {
    println("Length of Array is ${array.size}")
}
