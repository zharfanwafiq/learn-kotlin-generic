package variant

class Contravariant<in T>() {
    fun sayHello(name: T) {
        return print("Hello $name")
    }
}

fun main(){
    val data1: Contravariant<Any> = Contravariant()
    val data2: Contravariant<String> = data1

    data2.sayHello("Zharfan")
}