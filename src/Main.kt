fun main() {
    val value = max(5, 3)
    println("Max value is : $value")
    println("Max2 value is : ${max2(2, 6)}")

    //value 변수 :  변경 불가능(immutable)
    val question = "What;s wrong?"
    val answer = 123
    val poet: String = "Let it be forgotten"
    val age: Int = 25

    //variable 변수 : 변경 가능(mutable)
    var changeable = "old"
    changeable = "new"
}

// 1. 함수의 반환형은 파라미터 목록뒤에 온다(파라미터와 동일)
// 2. if는 문(statement)가 아니라 식(expression)이다. -> 값으로 취급할 수 있다.
fun max(a: Int, b: Int): Int {
    // 함수명:  max, 파라미터 : a: Int, b: Int, 반환타입 : Int
    return if (a > b) a else b;
    // 함수부분 return if (a > b) a else b;
}

// 함수의 반환 타입은 코틀린의 타입 추론(type inference)기능 덕분에 가능하다.
fun max2(a: Int, b: Int) = if (a > b) a else b;
