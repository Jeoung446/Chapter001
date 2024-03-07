package com.example.chapter1

//Lv1에서 만든 Calculator 클래스에 출력 이후 추가 연산을 가능하도록 코드를 추가하고,
//연산 진행 후 출력하기
//Lv1에서 만든 Calculator 클래스에 나머지 연산자(%)를 추가하기.
//그리고 -1을 입력 할 때까지 계산을 반복합니다. (1번 +, 2번 -, 3번 *, 4번 /, 5번 %)

// 파일의 목표
// 반복문과 조건문을 사용해 보자
// 누적 계산기처럼 해보자..... 어떻게 하는지는 알겠는데 어떻게 만드는지는 모르겠다
fun main() {
    var cal = Calculator2().adc()
    println(cal)
}

class Calculator2() {

    fun adc() {
        while (true) {
            var num1 = readln().toInt()
            val op = readLine().toString()
            var num2 = readln().toInt()

            var total = when (op) {
                "+" -> num1 + num2

                "-" -> num1 - num2

                "*" -> num1 * num2

                "/" -> num1 / num2

                "%" -> num1 % num2

                else -> break

            }
            if (total == -1) {
                println("다시 진행해주세요")
                break
            }

            println("답은 ${num1} ${op} ${num2} = ${total}")
        }
    }
}