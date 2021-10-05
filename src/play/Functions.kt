package play

import java.util.stream.Collector
import javax.print.attribute.standard.MediaSize

fun main() {
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye ")

    val pair = "Ferrari" to "Katrina"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")

    sophia likes claudia

    for (person: Person in sophia.likedPeople) {
        println(person.name)
    }

    infix fun Int.add(y: Int) = this + y;

    infix fun Int.delete(y: Int): Int {
        return this - y
    }

    println(1 add 2)
    println(3 delete 1)

    // operator fun Int.times(string: String) = string.repeat(this)
    // println(2 * "Bye ")

    operator fun String.get(range: IntRange) = substring(range)
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14])

    fun printAll(vararg messages: String) {
        for (m in messages) println(m)
    }

    printAll("Hello", "Hallo", "Salut", "Hola", "안녕하세요")
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {
        likedPeople.add(other)
    }
}