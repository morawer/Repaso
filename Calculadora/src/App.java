import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Creamos dos variables.
        int num1 = 0;
        int num2 = 0;
        String op = "si";

        /*
         * creamos una clase Scanner para introducir por consola los valores a las
         * variables num1, num2 y operation
         */

        Scanner lector = new Scanner(System.in);

        // Parte en la que el usuario introduce los numeros y la operacion a realizar.

        while (op.equalsIgnoreCase("si") || op.equalsIgnoreCase("ok")) {

            System.out.println("Introduce un numero: ");

            num1 = lector.nextInt();

            System.out.println("Introduce el segundo numero: ");

            num2 = lector.nextInt();

            System.out.println("¿Que operación quieres hacer?");

            op = lector.next();

            // Hacemos un if para hacer la operacion recibida por input.

            if (op.equalsIgnoreCase("suma")) {
                suma(num1, num2);
            } else if (op.equalsIgnoreCase("resta")) {
                resta(num1, num2);
            } else if (op.equalsIgnoreCase("multiplicacion")) {
                multiplicacion(num1, num2);
            } else if (op.equalsIgnoreCase("division")) {
                division(num1, num2);
            }

            System.out.println("¿Quieres continuar?");

            op = lector.next();

        }

        lector.close();

    }

    //Creamos las operaciones en metodos.

    static void suma(int num1, int num2) {
        System.out.println("El resultado es: " + (num1 + num2));
    }

    static void resta(int num1, int num2) {
        System.out.println("El resultado es: " + (num1 - num2));
    }

    static void multiplicacion(int num1, int num2) {
        System.out.println("El resultado es: " + (num1 * num2));
    }

    static void division(int num1, int num2) {
        System.out.println("El resultado es: " + (num1 / num2));
    }

}
