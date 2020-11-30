import java.util.Scanner;

public class Alfabeto_Navi {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    
    char[] Alfabr = { ' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
        's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
    
    String[] Navi = { "+", "Æ", "ß", "(", "Ð", "3", "F", "G", "¥", "|", "J", "K", "£", "M", "Ñ", "Ø", "P", "Q", "R",
        "ð", "T", "Ü", "V", "W", "X", "Y", "7" };

    String Texto = "";
    String novoTexto = "";
    String invertida = "";

    System.out.print("Informe sua frase para ser convertida em Navi --> ");
    Texto = teclado.nextLine();

    Texto = Texto.toLowerCase(); // para valor minusculo

    for (int i = 0; i < Texto.length(); i++) {
      for (int j = 0; j < 50 ; j++) { // 50 para que pegue a frase toda
        if (Texto.charAt(i) == Alfabr[j]) { //ve o caractere que esta no indice (charAt(i)) caractere do indice i
          novoTexto += Navi[j];
          break; // para parar quando nao tiver mais caractere
        }
      }
    }
    // invertendo a Na'vi

    for (int i = novoTexto.length() -1 ; i >= 0; i--) { // o i recebe os caracteres da String e vai realizando a inversão, i = 30, dps vai diminuindo 1 
      invertida += novoTexto.charAt(i);
    }

    System.out.println("\nTexto em Na'Vi -->\n" + invertida);
    teclado.close();
  }

}
