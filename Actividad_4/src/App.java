import java.util.Scanner;

public class App {

    /*
     * Escribe un programa Java que sirva para realizar un pequeño test de inglés al
     * usuario. El test consistirá en la traducción de 20 palabras del inglés al
     * español. Las palabras del test se extraerán de una matriz de 20 filas y 2
     * columnas. Comienza por este código y luego completa lo que falta:
     */

    public static void main(String[] args) throws Exception {

        Scanner lector = new Scanner(System.in);
        String respuesta;

        int aciertos = 0;
        int fallos = 0;

        String matrizIngles[][] = { { "bear", "oso" }, { "cat", "gato" }, { "cheetah", "guepardo" }, { "dog", "perro" },
                { "eagle", "aguila" }, { "fish", "pez" }, { "frog", "rana" }, { "horse", "caballo" },
                { "lion", "leon" }, { "lizard", "lagarto" }, { "meerkat", "suricata" }, { "monkey", "mono" },
                { "orangutan", "orangutan" }, { "panther", "pantera" }, { "parrot", "loro" }, { "pig", "cerdo" },
                { "tiger", "tigre" }, { "toad", "sapo" }, { "tortoise", "tortuga" }, { "mare", "yegua" } };

        for (int i = 0; i <= 19; i++) {

            System.out.println("Traduce la palabra: " + matrizIngles[i][0]);

            respuesta = lector.nextLine();

            if (respuesta.equalsIgnoreCase(matrizIngles[i][1])) {

                System.out.println("¡Respuesta correcta!");
                aciertos++;

            } else {
                System.out.println("¡Respuesta incorrecta!");
                fallos++;
            }

        }

        lector.close();

        System.out.println("¡Has tenido " + aciertos + " aciertos y " + fallos + " fallos!");

        if (aciertos > 15) {
            System.out.println("¡Eres un fiera!");
        } else if (aciertos < 5) {
            System.out.println("¡Eres un paquete!");
        } else {
            System.out.println("¡Sigue estudiando más!");
        }

    }
}
