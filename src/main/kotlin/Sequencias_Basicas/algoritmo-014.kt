package Sequencias_Basicas
import java.util.Scanner

fun main() {
  /* A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
  um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
  quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
  sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado. */

  println("Quantos Km o carro percorreu?")
  val valorInformado = Scanner(System.`in`)
  val kilometragem = valorInformado.nextDouble()

  println("Por quantos dias o carro foi alugado?")
  val numeroInformado = Scanner(System.`in`)
  val diasAlugado = numeroInformado.nextInt()

  println("O preço total a pagar pelo aluguel do carro é: R$${precoTotal(kilometragem, diasAlugado)}")
}

fun precoTotal(kmRodado: Double, qntdDia: Int): Double {
  val custoPorKm = kmRodado * 0.20
  val custoPorDia = qntdDia * 90
  return custoPorDia + custoPorKm
}
