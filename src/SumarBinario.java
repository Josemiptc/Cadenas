    import java.util.Scanner;

    public class SumarBinario {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Escribe un número binario: ");
            String n1 = sc.nextLine().trim();
            System.out.println("Escribe otro número binario: ");
            String n2 = sc.nextLine().trim();

            System.out.println(sumaBinario(n1 , n2));
        }
        public static String sumaBinario(String n1, String n2){
            String res = "";
            int b1, b2, suma, acarreo  = 0;
            for (int i = n1.length()- 1; i >= 0; i--){
                b1 = Character.getNumericValue(n1.charAt(i));
                b2 = Character.getNumericValue(n2.charAt(i));
                suma = b1 + b2 + acarreo;
                if (suma == 0){
                    res = "0" + res;
                } else if ( (suma == 1)) {
                    res = "1" + res;
                } else if (suma == 2) {
                    res = "0" + res;
                    acarreo = 1;
                }else {
                    res = "1" + res;
                    acarreo = 1;
                }
            }
            if (acarreo == 1) {
                res = "1" + res;
            }
            return res;
        }
    }
