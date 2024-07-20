package Sequencias_Basicas

import java.util.Scanner

fun main() {
  /* Crie um programa que leia o número de dias trabalhados em um mês e mostre o
  salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
  por hora trabalhada. */

  println("Informe o número de dias trabalhados no mês: ")
  val diasTrabalhados = Scanner(System.`in`).nextInt()
  print("O salário de um funcionário que trabalhou por ${diasTrabalhados} dias, é de: R$${salario(diasTrabalhados)}")
}

fun salario(dias: Int): Double {
  val horasTrabalhadas = dias * 8
  return (25 * horasTrabalhadas).toDouble()
}