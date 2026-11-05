import java.util.Scanner;

public class Invertida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una frase: ");
        String frase = sc.nextLine().trim();
        System.out.println(invertir(frase));
    }
    public static String invertir (String frase){
        String[] palabras = frase.split("\\s+");
        String invertida = "";
        for (int i = palabras.length - 1;i >= 0; i--){
             invertida = invertida + (palabras[i] + " ");
        }

        return(invertida);
    }
}
