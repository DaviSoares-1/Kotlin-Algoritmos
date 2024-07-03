package Sequencias_Basicas

import java.util.Scanner

fun main() {
  /* Desafio 007: Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a sua terça parte.*/

  /* Exemplo:
      Digite um número: 3.5
      O dobro de 3.5 é 7.0
      A terça parte de 3.5 é 1.16666 */

  print("Digite um número Real: ")
  val numeroDigitado = Scanner(System.`in`)
  val numeroReal: Double = numeroDigitado.nextDouble()

  val resultado = "O dobro de $numeroReal é ${numeroReal * 2} \nA terça parte de $numeroReal é ${numeroReal / 3}"

  println(resultado)
}