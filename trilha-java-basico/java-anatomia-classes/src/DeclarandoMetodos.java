public class DeclarandoMetodos {
  
  public static void main(String [] args) {
    
    String primeiroNome = "José Vitor Mendes";
    String segundoNome = "Bacalhau";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);

  }

  // Estrutura básica de um Método!
  public static String nomeCompleto (String primeiroNome, String SegundoNome ) { // Aqui ele informa o tipo do método e o nomeDoMetodo, seguido dos argumentos a serem recebidos para o método funcionar
    return primeiroNome.concat(" ").concat(SegundoNome); // Eu pedi para retornar o primeiro argumento(primeiroNome), concatenando(significa juntar) com o segundo argumento SegundoNome. Mas eu podia ter chamado só um dos argumento sem problemas!
  }
}
