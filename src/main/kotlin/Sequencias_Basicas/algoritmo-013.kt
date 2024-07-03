package Sequencias_Basicas
import java.util.Scanner

fun main() {
  /* Desafio 013: Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o seu novo salário, com 15% de aumento.*/

  println("Digite o salário do funcionário: ")
  val valorDigitado = Scanner(System.`in`)
  val salario = valorDigitado.nextDouble()
  println("Para um salário de R$${salario} reais, com o aumento de 15% fica: R$${novoSalario(salario)} reais.")
}

fun novoSalario(valor: Double): Double {
  val aumento = valor * 0.15
  return String.format("%.2f", valor + aumento).toDouble()
}