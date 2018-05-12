package com.easy.kotlin

import java.io.File

/**
 * 7.9.3 嵌套 object 对象
 */

class DataProcessor {

    fun process() {
        println("Process Data")
    }

    object FileUtils {
        val userHome = "/Users/jack/"
        fun getFileContent(file: String): String {
            var content = ""
            val f = File(file)
            f.forEachLine { content = content + it + "\n" }
            return content
        }

    }

    // 伴生对象
    companion object StringUtils {
        fun isEmpty(s: String): Boolean {
            return s.isEmpty()
        }
    }
}

fun main(args: Array<String>) {
    println(DataProcessor.FileUtils.userHome)
    println(DataProcessor.FileUtils.getFileContent("test.data"))
    println(DataProcessor.StringUtils.isEmpty(""))

    // 只能使用类名访问 object，不能使用对象实例。
    /*val dp = DataProcessor()
    dp.process()
    dp.FileUtils.userHome*/
}