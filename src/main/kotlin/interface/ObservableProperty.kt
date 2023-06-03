package `interface`

import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty


fun main() {
    val car = Car("Toyota")
    car.brand = "Wuling"
    println(car.brand)
}

class Car(brand: String) {
    var brand: String by LogObservableProperty(brand)
}

class LogObservableProperty<T>(data: T) : ObservableProperty<T>(data) {
    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
        println("Before Change value from $oldValue to $newValue")
        return true
    }

    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
        println("After Change value from $oldValue to $newValue")

    }

}