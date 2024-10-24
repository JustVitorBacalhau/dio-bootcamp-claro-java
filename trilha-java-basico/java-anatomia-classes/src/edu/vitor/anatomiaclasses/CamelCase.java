package edu.vitor.anatomiaclasses;
public class CamelCase { // Padrão de escrita de uma classe java, CamelCase, onde a primeira palava da classe é maiúscula e a segunda palavra começa com uma letra maiúscula também.
  
  public static void main(String [] args) {

    String camelCase = "O camelCase é um padrão de escrita de uma variável, primeira palavra minúscula e a segunda palava maiúscula ";
    System.out.println(camelCase);

    final String BR = "Brasil"; // Esse é a forma de escrever uma constante, onde a variável não pode ser modificada, como eu vou fazer a seguir com a variável camelCase.
    // Quando uma variável é toda MAIÚSCULA, podemos entender que ela é uma constante ou seja, começa com final, seguido do tipo da variável(String, Int, Long ...) e o nome que da variável.

    System.out.println(BR);

    camelCase = "Mudando o dado da Variável camelCase";

    System.out.println(camelCase);

    final int ESTADOS_BRASILEIROS = 27; // UPPERCASE, utilizado para constantes e usado em palavras compostas o _(underline) após a primeira palavra. Ex: ESTADOS_BRASILEIROS

    final int ANOS_2000 = 2000;
  
    System.out.println("Quantidade de Estados Brasileiros: "+ ESTADOS_BRASILEIROS);
    System.out.println("Anos " + ANOS_2000);

  }
}
