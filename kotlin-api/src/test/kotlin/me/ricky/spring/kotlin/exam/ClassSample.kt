package me.ricky.spring.kotlin.exam

import org.junit.jupiter.api.Test

class ClassSample {
    var name: String = "Ricky"
    var age: Int = 34
    var country: String = "South Korea"
    var height: Int = 180
    var weight: Int = 100

    fun sayHello() {
        println("Hello, I'm $name")
    }

    fun introduce() {
        println("I'm $name, $age years old, from $country")
    }

    @Test
    fun test() {
        val ricky = ClassSample()
        ricky.sayHello()
        ricky.introduce()

        ricky.age = 20
        println("ricky.age: ${ricky.age}")
    }
}