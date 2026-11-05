import java.util.Scanner;

public class Digitos2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frase = "";
        System.out.println("Escribe una frase: ");
        frase = sc.nextLine().trim();
        System.out.println(contarNumeros(frase));

    }

    public static int contarNumeros(String frase){
        String[] palabras = frase.split("\\s+");
        int contador = 0;

        for (int i = 0; i < palabras.length; i++) {
            String palabra_actual = palabras[i];

            boolean es_numero = true;

            for (int j = 0; j < palabra_actual.length(); j++) {
                if (!Character.isDigit(palabra_actual.charAt(j))) {
                    es_numero = false;
                    break;
                }
            }

            if (es_numero) {
                contador++;
            }
        }
        return contador;
    }
}
