package Sequencias_Basicas

fun main() {
  /* Desafio 002: Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-vindas para ela:

    Exemplo:
      Qual é o seu nome? João da Silva
      Olá João da Silva, é um prazer te conhecer! */

  /* readLine(); Função que permite passar um input do tipo string no console. Podemos atribuir o retorno deste input a uma variável e reutilizá-la. */

  println("Qual é o seu nome? ")
  val nome = readLine()
  println("Olá $nome, é um prazer te conhecer!")
}