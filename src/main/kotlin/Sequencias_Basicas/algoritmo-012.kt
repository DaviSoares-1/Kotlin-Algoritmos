package Sequencias_Basicas
import java.util.Scanner

fun main() {
  /* Desafio 012: Crie um programa que leia o preço de um produto, calcule e mostre o seu PREÇO PROMOCIONAL, com 5% de desconto.*/

  println("Informe o preço do produto: ")
  val valorProcessado = Scanner(System.`in`)
  val precoProduto = valorProcessado.nextDouble()
  println("PREÇO PROMOCIONAL; de R$$precoProduto por apenas R$${precoPromocional(precoProduto)}, 5% de desconto na compra a vista!!")
}

/* Maneiras de formatar um número real para q qntd de casas decimais desejada; https://www.techiedelight.com/round-up-a-float-or-a-double-with-2-decimal-places-in-kotlin*/

fun precoPromocional(preco: Double): Double {
  val desconto = preco * 0.05
  return String.format("%.2f", preco - desconto).toDouble()
}