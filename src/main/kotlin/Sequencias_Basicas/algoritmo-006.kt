package Sequencias_Basicas

import java.util.*

fun main() {
  /* Desafio 006: Faça um programa que leia um número inteiro e mostre o seu antecessor e seu sucessor.*/

  /* Exemplo:
      Digite um número: 9
      O antecessor de 9 é 8
      O sucessor de 9 é 10 */

  print("Digite um número: ")
  val numeroDigitado = Scanner(System.`in`)
  val numero: Int = numeroDigitado.nextInt()

  val antecessor = numero - 1
  val sucessor = numero + 1
  val mensagem = "O antecessor de $numero é $antecessor \nO sucessor de $numero é $sucessor"

  println(mensagem)
}