import java.util.Scanner;

public class Siglas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = "";
        System.out.println("Escribe algo de lo que quieras saber sus siglas: ");
        frase = sc.nextLine().trim();


        System.out.println(siglas(frase));
    }
    public static String siglas (String frase){
        String[] palabras = frase.split("\\s+");
        String siglasv="";
        for (int i = 0; i < palabras.length; i++){
            for (int j = 0; j < palabras[i].length(); j++){
                if(Character.isUpperCase(palabras[i].charAt(j))) {
                    siglasv = siglasv + palabras[i].charAt(j);
                }

            }
        }
        return (siglasv);
    }
}
