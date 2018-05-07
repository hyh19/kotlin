package sec3

/**
 * 7.3.1 读写属性和只读属性
 */

class Item(barCode: String, name: String, price: Double) {
    // 只读属性
    val barCode = barCode
    val name = name
    val price = price
}

fun main(args: Array<String>) {
    var item = Item("1234-5678", "iPhone", 5288.0)
    println("${item.barCode} ${item.name} ${item.price}")
}