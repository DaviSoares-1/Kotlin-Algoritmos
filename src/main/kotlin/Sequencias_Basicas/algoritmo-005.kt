package Sequencias_Basicas

import java.util.Scanner

fun main() {
  /* Desafio 005: Faça um programa que leia as duas notas de um aluno em uma matéria e mostre na tela a sua média na disciplina.*/

  /* Exemplo:
      Nota 1: 4.5
      Nota 2: 8.5
      A média entre 4.5 e 8.5 é igual a 6.5 */

  print("Digite a Nota 1: ")
  val notaDigitada1 = Scanner(System.`in`)
  val nota1: Double = notaDigitada1.nextDouble()

  print("Digite a Nota 2: ")
  val notaDigitada2 = Scanner(System.`in`)
  val nota2: Double = notaDigitada2.nextDouble()

  val media = (nota1 + nota2) / 2
  val mensagem = "A média entre $nota1 e $nota2 é igual a $media"

  println(mensagem)
}