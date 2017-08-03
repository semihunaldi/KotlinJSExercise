package com.semihunaldi.kotlin

import kotlin.js.Date

fun main(args: Array<String>) {
    println("Hello, World!")
    testCall()
}

fun testCall(): Double
{
    val s = Date()
    println(s.getTime())
    return s.getTime()
}
