package Sequencias_Basicas
import java.util.*

fun main() {
  /* Desafio 011: Desenvolva uma lógica que leia os valores de A, B e C de uma equação do segundo grau e mostre o valor de Delta.*/

  println("Informe os coeficientes de uma equação do segundo grau.")

  print("Digite o valor do coeficiente A (diferente de 0): ")
  val valor1 = Scanner(System.`in`)
  val A: Int = valor1.nextInt()

  print("Digite o valor do coeficiente B: ")
  val valor2 = Scanner(System.`in`)
  val B: Int = valor2.nextInt()

  print("Digite o valor do coeficiente C: ")
  val valor3 = Scanner(System.`in`)
  val C: Int = valor3.nextInt()

  // Math.pow(base, expoente);
  val delta = Math.pow(B.toDouble(), 2.0).toInt() - 4 * A * C

  println("O delta da equação (${A})x²+(${B})x+(${C}) é: $delta")
}