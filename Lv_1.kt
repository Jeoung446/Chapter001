package com.example.chapter1

//더하기, 빼기, 나누기, 곱하기 연산을 수행할 수 있는 Calculator 클래스를 만들고,
//클래스를 이용하여 연산을 진행하고 출력하기

// 파일의 목표
// 연산자를 사용해 보자, 출력문에서 작성해 보자
fun main() {
    var cal = Calculator().calculate()
    println(cal)
}

class Calculator() {
    fun calculate() {
        var num1 = readln().toInt()
        val op = readln()
        var num2 = readln().toInt()
        val result = when (op) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 - num2
            "/" -> num1 / num2
            else -> println("다시 하세요")
        }
        println("답은 ${num1} ${op} ${num2} = ${result}")
    }
}