package com.example.chapter1

//- AddOperation(더하기), SubstractOperation(빼기), MultiplyOperation(곱하기), DivideOperation(나누기) 연산 클래스를을 만든 후 클래스간의 관계를 고려하여
//Calculator 클래스와 관계를 맺기
//- 관계를 맺은 후 필요하다면 Calculator 클래스의 내부 코드를 변경하기
//- 나머지 연산자(%) 기능은 제외합니다.
//- Lv2 와 비교하여 어떠한 점이 개선 되었는지 스스로 생각해 봅니다.
//- hint. 클래스의 책임(단일책임원칙)

// 파일의 목표
// override를 사용해 보자
// 단일책임원칙이라는 의미를 알아보자
fun main() {
    var a = Add().add()
}

open class Calculator3() {
    var num1 = readln().toInt()
    var op = readln()
    var num2 = readln().toInt()
    open fun add() {
        when(op) {
            "+" -> println(num1 + num2)
        }
        return
    }
    open fun minus() {
        when(op) {
            "-" -> println(num1 - num2)
        }
        return
    }
    open fun multiple() {
        when(op) {
            "*" -> println(num1 * num2)
        }
        return
    }
    open fun devide() {
        when(op) {
            "/" -> println(num1 / num2)
        }
        return
    }
}

class Add() : Calculator3() {
    override fun add() {
        super.add()
    }
}

class Minus() : Calculator3() {
    override fun minus() {
        super.minus()
    }
}

class Mutiple() : Calculator3() {
    override fun devide() {
        super.devide()
    }
}

