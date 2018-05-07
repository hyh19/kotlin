package sec3

/**
 * 7.3.1 读写属性和只读属性
 */
class Address {
    // 读写属性
    var street: String = ""
    var city = ""
    var province = ""
    var postCode: String? = null
}

fun main(args: Array<String>) {
    var addr = Address()
    addr.street = "大岗工业路"
    addr.city = "广州"
    println("${addr.city} ${addr.street}")
}