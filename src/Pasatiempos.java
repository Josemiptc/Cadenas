import java.util.Scanner;

public class Pasatiempos {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un texto: ");
        String texto = sc.nextLine();

        String resultado = "";

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' ||
                    letra == 'o' || letra == 'u' ||
                    letra == 'A' || letra == 'E' || letra == 'I' ||
                    letra == 'O' || letra == 'U') {
                resultado += ".";
            } else {
                resultado += letra;
            }
        }

        System.out.println(crearPasatiempo(resultado));
    }
    public static String crearPasatiempo(String texto){
        String resultado = "";

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' ||
                    letra == 'o' || letra == 'u' ||
                    letra == 'A' || letra == 'E' || letra == 'I' ||
                    letra == 'O' || letra == 'U') {
                resultado += ".";
            } else {
                resultado += letra;
            }
        }
        return resultado;
    }
}
