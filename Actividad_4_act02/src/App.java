import java.util.Scanner;

public class App {

    /*
     * Escribe un programa Java que funcione de acuerdo a las siguientes
     * especificaciones:
     * 
     * - Debe permitir al usuario introducir un texto por teclado. 
     * - Se mostrará en pantalla la longitud del texto (número de caracteres).
     * - Se mostrará el texto en mayúsculas. 
     * - Se mostrará el texto separado por palabras (cada palabra en
     *   una línea) usando el método split(). 
     * - Se contará el número de letras
     *   minúsculas. 
     * - Se mostrará un triángulo con el texto introducido.
     * 
     */
    public static void main(String[] args) throws Exception {

        Scanner lector = new Scanner(System.in);
        String texto;

        System.out.println("Introduce un texto");

        texto = lector.nextLine();

        System.out.println("El texto tiene " + texto.length() + " carácteres.");

        System.out.println(texto.toUpperCase());

        String[] cadena = (texto.split(" "));

        for (int i = 0; i < cadena.length; i++) {
            System.out.println(cadena[i]);
        }

        for (int i = texto.length(); i>0; i--) {
            for (int a = 0; a < i; a++) {
                System.out.print(texto.charAt(a));
            }
            System.out.println(" ");
        }

        lector.close();

    }
}
