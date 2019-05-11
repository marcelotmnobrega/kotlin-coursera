package br.com.mtmn.kotlincoursera.week02

fun respondToInput(input: String) =
    when (input) {
        "y", "yes" -> "I'm glad you agree"
        "n", "no" -> "Sorry to hear that"
        else -> "I don't understand you"
    }

enum class Color {
    BLUE, ORANGE, RED, YELLOW, VIOLET, INDIGO, GREEN
}

fun getDescription(color: Color): String =
    when (color) {
        Color.BLUE -> "cold"
        Color.ORANGE -> "mild"
        Color.RED -> "hot"
        else -> "not sure"
    }

fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
        setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
        else -> throw Exception("Dirty Color")
    }

sealed class Pet

class Cat : Pet() {
    fun meow() {
        println("meowwww")
    }
}

class Dog : Pet() {
    fun woof() {
        println("meowwww")
    }
}

//Smart cast
fun act(pet: Pet) =
    when (pet) {
        is Cat -> pet.meow()
        is Dog -> pet.woof()
    }

class Loops {

    fun forr() { //abc
        val list = listOf("a", "b", "c")
        for (s in list) {
            print(s)
        }
    }

    fun formap() {
        val map = mapOf(
            1 to "one",
            2 to "two",
            3 to "three"
        )

        for ((key, value) in map) {
            println("$key = $value")
        }
    }

    fun forr2() {  //prints: 0: a \n 1: b \n 2: c
        var list = listOf("a", "b", "c")
        for ((index, element) in list.withIndex()) {
            println("$index: $element")
        }
    }

    fun forr3() {
        for (i in 1..9) {
            print(i) //123456789
        }

        for (i in 1 until 9) {
            print(i) //12345678
        }
    }

    fun forr4() {
        for (ch in "abc") { //prints bcd
            print(ch + 1)
        }
    }
}