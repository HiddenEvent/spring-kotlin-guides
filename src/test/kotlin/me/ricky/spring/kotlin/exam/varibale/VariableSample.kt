package me.ricky.spring.kotlin.exam.varibale

class VariableSample {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val number1 = 123
            val number2 = 123L
            val number3 = 123.0
            val number4 = 123.0f
            val isTrue = true
            val char = 'A'
            val string = "Hello, World!"
            val string2 = """Hello, World!"""

            println("number1: $number1")
            println("number2: $number2")
            println("number3: $number3")
            println("number4: $number4")
            println("isTrue: $isTrue")
            println("char: $char")
            println("string: $string")
            println("string2: $string2")

        }
    }
}