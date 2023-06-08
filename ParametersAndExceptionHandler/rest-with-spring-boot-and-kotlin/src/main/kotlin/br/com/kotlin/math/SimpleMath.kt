package br.com.kotlin.math

import kotlin.math.sqrt

class SimpleMath {
    fun soma(numberOne: Double, numberTwo: Double) = numberOne + numberTwo
    fun subtracao(numberOne: Double, numberTwo: Double) = numberOne - numberTwo
    fun multiplicacao(numberOne: Double, numberTwo: Double) = numberOne * numberTwo
    fun divisao(numberOne: Double, numberTwo: Double) = numberOne / numberTwo
    fun media(numberOne: Double, numberTwo: Double) = (numberOne + numberTwo)/2
    fun raizQuadrada(number: Double) = sqrt(number)
}