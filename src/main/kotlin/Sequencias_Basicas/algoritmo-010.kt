package Sequencias_Basicas
import java.util.Scanner

fun main() {
  /* Desafio 010: Faça um algoritmo que leia a largura e altura de uma parede, calcule e mostre a área a ser pintada e a quantidade de tinta necessária para o serviço, sabendo que cada litro de tinta pinta uma área de 2metros quadrados.*/

  print("Digite uma largura em metros: ")
  val dimensao1 = Scanner(System.`in`)
  val largura: Double = dimensao1.nextDouble()

  print("Digite uma altura em metros: ")
  val dimensao2 = Scanner(System.`in`)
  val altura: Double = dimensao2.nextDouble()

  /* Se para cada litro pintamos 2m², logo o volume de tinta
  * necesário é a aŕea da parede divido por 2. */
  val areaParede = largura * altura
  val litroTinta = areaParede / 2

  println("Para uma parede de $areaParede m²,\nsão necessários $litroTinta litros de tinta!!")
}