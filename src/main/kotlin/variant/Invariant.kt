package variant

fun main() {
    invariant()
}

fun invariant() {
    val data1: Invariant<String> = Invariant("Taufiq")
//    val data2: Invariant<Any> = data1 //error
}

class Invariant<T>(data: T)
