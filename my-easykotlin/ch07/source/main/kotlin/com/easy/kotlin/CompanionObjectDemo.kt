package com.easy.kotlin

import sun.misc.BASE64Encoder
import java.io.UnsupportedEncodingException
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import java.text.SimpleDateFormat
import java.util.*

/**
 * 7.9.2 object 对象
 */

object AdminUser {
    const val username: String = "admin"
    private const val password: String = "admin"
    private fun getTimestamp() = SimpleDateFormat("yyyyMMddHHmmss").format(Date())
    fun md5Password() = encodeByMd5(password + getTimestamp())
}

@Throws(NoSuchAlgorithmException::class, UnsupportedEncodingException::class)
fun encodeByMd5(str: String): String {
    val md5 = MessageDigest.getInstance("MD5")
    val base64en = BASE64Encoder()
    return base64en.encode(md5.digest(str.toByteArray(charset("utf-8"))))
}

fun main(args: Array<String>) {
    val adminUser = AdminUser.username
    val adminPassword = AdminUser.md5Password()
    println(adminUser)
    println(adminPassword)
}