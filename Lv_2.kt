package com.example.chapter1

//Lv1에서 만든 Calculator 클래스에 출력 이후 추가 연산을 가능하도록 코드를 추가하고,
//연산 진행 후 출력하기
//Lv1에서 만든 Calculator 클래스에 나머지 연산자(%)를 추가하기.
//그리고 -1을 입력 할 때까지 계산을 반복합니다. (1번 +, 2번 -, 3번 *, 4번 /, 5번 %)

// 파일의 목표
// 반복문과 조건문을 사용해 보자
// 누적 계산기처럼 해보자..... 어떻게 하는지는 알겠는데 어떻게 만드는지는 모르겠다
// ...어찌 저찌 수정

fun main() {
    var cal = Calculator2().calculate()
}

class Calculator2() {
    fun calculate() {
        var total = readln().toInt()
        while (true) {
            val op = readln()
            val num = readln().toInt()


            when (op) {
                "+" -> total += num
                "-" -> total -= num
                "*" -> total *= num
                "/" -> total /= num
                else -> println("잘못된 연산자입니다.")
            }
            if (total == -1) {
                break
            }
            println("현재 결과: ${total}")
        }
        println("최종 결과: ${total}")
    }
}
