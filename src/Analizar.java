import java.util.Locale;
import java.util.Scanner;

public class Analizar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;
        System.out.println("Escribe una palabra: ");
        palabra = sc.next();

        System.out.println(palabra.length());
        System.out.println(palabra.charAt(0));
        System.out.println(palabra.charAt(palabra.length()-1));
        System.out.println(palabra.toUpperCase());
        System.out.println(palabra.toLowerCase());
        int vocales = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char c = Character.toLowerCase(palabra.charAt(i));
            if ("a".indexOf(c) != -1) {
                vocales++;
            }
        }
        System.out.println(vocales);
    }
}
