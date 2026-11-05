import java.util.Scanner;

public class Parentesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe una frase: ");
        String frase = sc.nextLine().trim();
        System.out.println(esParentizada(frase));
    }
    public static boolean esParentizada(String frase){
        boolean bien = true;
        int cont = 0;
        for (int i = 0; i < frase.length(); i++){
            char caracterActual = frase.charAt(i);

            if (caracterActual == '(') {
                cont++;
            } else if (caracterActual == ')') {
                cont--;
                if (cont <= -1){
                    break;
                }
            }
        }
        if (cont == 0){
            bien = true;
        }else bien = false;

        return(bien);
    }
}
