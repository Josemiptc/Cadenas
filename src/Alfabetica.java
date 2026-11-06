import java.util.Scanner;

public class Alfabetica {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine().toLowerCase().trim();

        System.out.println(esAlfabetica(palabra));
    }
    public static boolean esAlfabetica(String palabra){
        boolean alfabetica = true;

        for (int i = 0; i < palabra.length() - 1; i++) {
            if (palabra.charAt(i) > palabra.charAt(i + 1)) {
                alfabetica = false;
                break;
            }
        }

        if (alfabetica) {
            alfabetica = true;
        } else {
            alfabetica = false;
        }
        return alfabetica;
    }
}
