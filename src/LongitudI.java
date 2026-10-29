import java.util.Scanner;

public class LongitudI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = "";
        System.out.println("Escribe una frase: ");
        frase = sc.nextLine().trim();
        int longitud;
        System.out.println("Escribe una longitud: ");
        longitud = sc.nextInt();

        System.out.println("Hay " + comprueba(frase, longitud) + " palabras con una longitud de " + longitud);
    }
    public static int comprueba(String frase, int longitud){
        int cont = 0;
        String[] frase_array = frase.split("\\s+");
        for (int i = 0; i < frase_array.length; i++){
            if (frase_array[i].length() == longitud){
                cont = cont + 1;
            }
        }
        return(cont);
    }
}
