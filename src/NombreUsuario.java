import java.util.Scanner;

public class NombreUsuario {
    public static void main(String[] args) {
        String nombre_completo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nombre completo: ");
        nombre_completo = sc.nextLine().trim();

        String[] separados = nombre_completo.split("\\s+"); // \\s indica que puede coger mas de 1 espacio
        if (separados.length == 3) {
            String nombre_bien = "";
            for (int i = 0; i < separados.length; i++) {
                nombre_bien += separados[i].substring(0, 1).toUpperCase(); // Me quedo con la 1ra letra
                nombre_bien += separados[i].substring(1).toLowerCase() + " "; // Me quedo con el resto de letras
            }
            System.out.println("Nombre formateado: " + nombre_bien);
            String abreviacion = "";
            for (int i = 0; i < separados.length; i++) {

                abreviacion = abreviacion + separados[i].substring(0, 1).toUpperCase() + ".";
            }
            System.out.println("Iniciales: " + abreviacion);
            String nombre_usuario = "";
            nombre_usuario = separados[0].substring(0, 1).toLowerCase() + separados[1].toLowerCase() + separados[2].substring(0, 1).toLowerCase();
            System.out.println("Usuario: " + nombre_usuario);
        }else System.out.println("Error,el nombre tiene que tener 3 palabras.");
    }
}
