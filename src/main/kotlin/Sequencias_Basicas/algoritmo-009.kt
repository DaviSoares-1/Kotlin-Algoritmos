package Sequencias_Basicas

import java.util.Scanner
import kotlin.math.roundToInt

fun main() {
  /* Desafio 009: Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$) e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.*/

  print("Quantos reais tem na sua carteira: ")
  val valorDigitado = Scanner(System.`in`)
  val saldo: Float = valorDigitado.nextFloat()
  val conversaoDolar = ((saldo / 3.45))

  /* Colocando o resultado da conversão para 2 casas decimais
  após a vírgula. */
  val qntCasasDecimais = "%.${2}f".format(conversaoDolar)

  println("Com R$$saldo reais, você pode comprar US$$qntCasasDecimais dólares.")
}