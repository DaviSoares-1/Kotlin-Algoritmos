package Sequencias_Basicas

import java.util.Scanner

fun main() {
  /* Desafio 008: Desenvolva um programa que leia uma distância em metros e mostre os valores relativos em outras medidas.*/

  /* Exemplo:
      Digite uma distância em metros: 185.72
      A distância de 85.7m corresponde a:
      0.18572Km   1857.2dm
      1.8572Hm    18572.0cm
      18.572Dam   185720.0mm */

  print("Digite uma distância em metros: ")
  val distDigitada = Scanner(System.`in`)
  val distancia: Float = distDigitada.nextFloat()

  val unidadesDeMedida = """
    ${distancia / 1000}Km   ${distancia * 10}dm
    ${distancia / 100}Hm    ${distancia * 100}cm
    ${distancia / 10}Dam    ${distancia * 1000}mm
  """.trimIndent()

  println(unidadesDeMedida)
}