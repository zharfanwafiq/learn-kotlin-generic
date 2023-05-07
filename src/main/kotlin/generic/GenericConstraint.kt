package generic

fun main() {
//    val data1 = Company(Manager())
    val data2 = Company(VicePresident())
    data2.employee.sayHello("Zharfan")
//    val data3 = Company(Employee())
}

open class Employee

class Manager : Employee()

class VicePresident : Employee(), CanSayHello {
    override fun sayHello(name: String) {
        println(" Hello, My Name Is $name")
    }

}

class Company<T>(val employee: T) where T : Employee, T : CanSayHello

interface CanSayHello {
    fun sayHello(name: String)
}