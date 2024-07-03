package Sequencias_Basicas

import java.util.Scanner

fun main() {
  /* Desafio 003: Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma mensagem: */

  /* Exemplo:
        Nome do Funcionário: Maria do Carmo
        Salário: 1850,45
        O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho. */

  print("Nome do funcionário: ")
  val nome = readLine()

  print("Salário: ")
  val valorDigitado = Scanner(System.`in`)
  val salario: Double = valorDigitado.nextDouble()

  val mensagem = "O(A) funcionário(a) $nome tem um salário de R$$salario em Junho."
  println(mensagem)
}