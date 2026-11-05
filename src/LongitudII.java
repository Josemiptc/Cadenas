import org.xml.sax.helpers.AttributesImpl;

import java.util.Scanner;

public class LongitudII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frase="";
        System.out.println("Escribe una frase: ");
        frase = sc.nextLine().trim();
        int longitud = 0;
        System.out.println("Escribe una longitud: ");
        longitud = sc.nextInt();


        if (comprueba(frase, longitud) == true){
            System.out.println("Hay alguna palabra con una longitud de "+ longitud + " caracteres");
        }else System.out.println("No hay ninguna palabra con una longitud de " + longitud + " caracteres");
    }
    public static boolean comprueba(String frase, int longitud){
        String[] palabras = frase.split("\\s+");
        for (int i = 0; i < palabras.length; i++){
            if (palabras[i].length() == longitud){
                return true;
            }
        }
        return false;
    }
}
