package sec2

/**
 * 7.2.3 componentN 方法与解构
 */

class User(var name: String, var pass: String, var age: Int) {
    operator fun component1(): String {
        return this.name
    }

    operator fun component2(): String {
        return this.pass
    }

    operator fun component3(): Int {
        return this.age
    }
}

fun main(args: Array<String>) {
    val user = User("John", "123456", 28)

    // 解构两个变量
    var (name1, pass1) = user
    println("$name1 $pass1")

    // 解构三个变量
    var (name2, pass2, age2) = user
    println("$name2 $pass2 $age2")

    // 如果不想要某个属性，可以用 _ 占位。
    var (name3, _, age3) = user
    println("$name3 $age3")
}