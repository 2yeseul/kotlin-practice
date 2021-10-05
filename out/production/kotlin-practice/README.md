# 정리

## Unit 
Unit 타입은 return이 없다는 뜻. Java의 void와 같다
return type이 생략되면 Unit이라는 뜻이다.

## Prefix 
``` kotlin
fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}
```

prefix는 기본 값인 Info를 가진다.

## Named Argument
``` kotlin
printMessageWithPrefix(prefix = "Log", message = "Hello")
```
named arguments (명명된 인자)를 사용하면 함수에 정의된 인자 order과 관계없이 지정된 인자에 변수 대입

## infix
두 개의 변수 가운데에 오는 함수이다. 

반드시 멤버 함수이거나 확장 함수이어야 한다. 

단일 인자만을 가진다.

``` text
infix fun dispatcher.함수이름(receiver): 리턴타입 { 구현부 }
``` 

### 예제
``` kotlin
infix fun Int.times(str: String) = str.repeat(this)

println(2 times "Bye ") // Bye Bye
```


