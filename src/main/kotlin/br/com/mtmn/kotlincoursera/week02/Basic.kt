@file:JvmName("ClassNameToBeUsed")

package br.com.mtmn.kotlincoursera.week02

fun main(args: Array<String>) {
    val name = if (args.isNotEmpty()) args[0] else "Kotlin"
    println("Hello, $name!")
}

fun foo() = 0

