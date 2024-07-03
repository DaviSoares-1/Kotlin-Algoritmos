package Sequencias_Basicas

import java.util.Scanner

fun main() {
  /* Desafio 004: Desenvolva um algoritmo que leia dois números inteiros
  e mostre o somatório entre eles. */

  /* Exemplo:
     Digite um valor: 8
     Digite outro valor: 5
     A soma entre 8 e 5 é igual a 13. */

  print("Digite um valor: ")
  val valorDigitado1 = Scanner(System.`in`)
  val primeiroValor: Int = valorDigitado1.nextInt()

  print("Digite outro valor: ")
  val valorDigitado2 = Scanner(System.`in`)
  val segundoValor: Int = valorDigitado2.nextInt()

  println("A soma entre $primeiroValor e $segundoValor é igual a ${primeiroValor + segundoValor}")
}