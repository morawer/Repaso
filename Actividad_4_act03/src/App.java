import java.util.Scanner;
import java.util.StringTokenizer;

public class App {

    /*
     * Escribe un programa Java que funcione de acuerdo a las siguientes
     * especificaciones:
     * 
     * Debe permitir al usuario introducir varios textos terminando cuando escriba
     * la palabra FIN. Cada texto debe guardarse en un objeto de tipo String. Por
     * cada texto introducido (menos la palabra FIN) el programa debe informar del
     * número de caracteres. Se deben ir concatenando todos los textos introducidos
     * convertidos a mayúsculas (menos la palabra FIN) en un objeto de tipo
     * StringBuilder. Dentro del objeto StringBuilder cada texto nuevo debe terminar
     * con el carácter punto y coma. Por último, debemos utilizar un objeto de la
     * clase StringTokenizer para volver a mostrar los textos introducidos en líneas
     * separadas.
     */

    public static void main(String[] args) throws Exception {

        Scanner lector = new Scanner(System.in);

        String texto = " ";

        StringBuilder texto2 = new StringBuilder();

        while (!texto.equalsIgnoreCase("FIN")) {

            System.out.println("Introduce un texto: ");

            texto = lector.nextLine();

            if (!texto.equalsIgnoreCase("FIN")) {

                System.out.println("Longitud: " + texto.length());

                texto2.append(texto.concat(";"));

            }

        }

        texto = texto2.toString();

        StringTokenizer texto3 = new StringTokenizer(texto.toUpperCase(), ";");

        while (texto3.hasMoreTokens()) {
            System.out.println(texto3.nextToken());

        }

        lector.close();
    }
}
