package play

// 1) Unit 타입은 return이 없다는 뜻. Java의 void와 같다
fun printMessage(message: String): Unit {
    println(message)
}

// 2) return type이 생략되면 Unit이라는 뜻이다. prefix는 기본 값인 Info를 가진다.
fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y

fun main() {
    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    // named arguments (명명된 인자)를 사용하면 함수에 정의된 인자 order과 관계없이 지정된 인자에 변수 대입
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println(sum(1, 2))
    println(multiply(2, 4))
}