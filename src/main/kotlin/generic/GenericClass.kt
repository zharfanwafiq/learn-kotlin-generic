package generic

fun main() {
    notGenericFunction()
    genericFunction()
}

fun notGenericFunction() {
    val dataString = DataX("Zharfan")
    val valueString = dataString.data as String
    println(valueString)

    val dataInt = DataX(1)
    val valueInt = dataInt.data as Int //use as force data type become it is like Int
    println(valueInt)
}

fun genericFunction() {
    val dataString = DataY("Zharfan")
    val valueString = dataString.data
    println(valueString)

    val dataInt = DataY(1)
    val valueInt = dataInt.data
    println(valueInt)
}

class DataX(val data: Any)

class DataY<T>(val data: T)
