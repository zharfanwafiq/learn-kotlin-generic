package `interface`

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun main() {
    readWriteProperty()
}

fun readWriteProperty() {
    val person = Person("Zharfan")
    person.name = "Wafiq"
    println(person.name)
}

class Person(param: String){
    var name: String by StringLogReaderWriteProperty(param)
}

class StringLogReaderWriteProperty(private var data: String): ReadWriteProperty<Any, String> {
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("You get data ${property.name} is $data")
        return data
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        println("You set data ${property.name} from $data to $value")
        data = value
    }

}