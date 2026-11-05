import java.util.Scanner;

public class Digitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = "";
        System.out.println("Escribe una frase: ");
        frase = sc.nextLine().trim();
        System.out.println(cuantosSonDigitos(frase) + " dígitos.");
    }
    public static int cuantosSonDigitos(String frase){
        int digitos = 0;
        for (int i = 0; i < frase.length(); i++){
            if (Character.isDigit(frase.charAt(i))){
                digitos++;
            }
        }
        return digitos;
    }
}
