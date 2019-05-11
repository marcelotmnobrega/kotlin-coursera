package br.com.mtmn.kotlincoursera.week02

class NamedDefaultArgs {

    fun main() {
        println(listOf('a', 'b', 'c').joinToString(separator = "", prefix = "(", postfix = ")")) //(abc)
        println(listOf(1, 2, 3).joinToString(postfix = "."))  //1, 2, 3.
        displaySeparator(character = '5', size = 3)
    }

    private fun displaySeparator(character: Char = '*', size: Int = 10) =
        repeat(size) { print(character) }


    @JvmOverloads //generates 4 overloaded methods: empty, a, a+b, a+b+c
    fun sum(a: Int = 0, b: Int = 0, c: Int = 0) = a + b + c


}