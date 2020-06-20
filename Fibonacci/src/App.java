import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * Creamos una clase Scanner para pedir al usuario un numero, el cual será el
         * limite de la secuencia de Fibonacci.
         */

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce un numero:");

        /*
         * Creamos la variable "numLim". el valor sera asignado por el usuario a traves
         * de la consola.
         */

        int numLim = lector.nextInt();

        lector.close();

        // Creamos 3 variables.

        int num1 = 1;
        int num2 = 0;
        int suma = 0;

        System.out.println(suma);

        /*
         * Creamos un bucle "Do-while" el cual, de primeras imprime en pantalla el valor
         * de "suma" y despues el valor de la variable "num1" es asiganda a "num2" y el
         * valor de "suma" a "num1" y asi sucesivamente hasta que el valor de "suma"
         * sobrepase a la varible "numLim".
         */

        do {
            System.out.println(suma);

            suma = num1 + num2;

            num2 = num1;

            num1 = suma;

        } while (suma <= numLim);

    }

}
