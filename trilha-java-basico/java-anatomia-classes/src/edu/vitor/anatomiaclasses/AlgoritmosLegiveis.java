package edu.vitor.anatomiaclasses;

public class AlgoritmosLegiveis {
  
  public static void FormaIncorreta() {
    //Forma incorreta de escrever uma variável.
    Double salMedio = 1500.0; // Variável abreviada não é indicada!
    String emails = "aluno@escola.com"; // Variável fica confusa, pois são emails(plural), mas contem apenas um email!
    String myName = "JOSEPH"; // Por mais que meu valor seja em inglês, mas minha convensão seja em pt-br, é indicado que a variável seja em pt-br.
  }

  public static void FormaCorreta() {
    //Forma correta de escrever uma variável.
    Double salarioMedio = 1500.0; // Variável devidamente declarada sem abreviação!
    String email = "aluno@escola.com"; // Variável email, onde é passado apenas um email!
    String [] emails = {"aluno@escola.com", "professor@escola.com"}; // emails sendo passados dentro de array.
    String meuNome = "JOSEPH"; // Variável em pt-br, de acordo com a convenção da aplicação!
  }

  // Os métodos devem ser escritos como VERBOS! esses ultimos 2 métodos são exeplos de como não escrever o nome do método!

  // Exemplo de um método bem escrito!
  public static int SomarNumeros(int primeiroNumero, int segundoNumero) {
    return primeiroNumero + segundoNumero;
  }

  // Outro tipo de forma de escrever mal um método:
  // Por mais que esteja escritos com VERBOS, É melhor criar dois métodos, um CALCULAR e outro IMPRIMIR.
  public static void CalcularImprimir() {
  }

  // Existem algumas vezes que vão ser utilizados métodos em inglês por conta de algumas bibliotecas. EX:
  public static int findById(int id) {
    return id;
  }
}
