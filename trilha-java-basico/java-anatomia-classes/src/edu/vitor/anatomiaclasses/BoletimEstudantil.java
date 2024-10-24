package edu.vitor.anatomiaclasses;
public class BoletimEstudantil {
  public static void main(String [] args) {

    int mediaFinal = 6;

    //Exemplo de uma identação bem realizada
    if(mediaFinal < 6) {
      System.out.println("REPROVADO");
    }else if(mediaFinal == 6) {
      System.out.println("PROVA MINERVA");
    } else {
      System.out.println("APROVADO");
    }
  } 
}
