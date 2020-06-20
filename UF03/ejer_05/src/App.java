package ejer_05.src;

/* Realiza un programa en Java que genere un número al azar entre 1 y 5. 
Una vez generado deberás utilizar una estructura alternativa múltiple (switch) 
para escribir en pantalla una cadena de texto diferente, según el número generado. */

public class App {
    public static void main(String[] args) throws Exception {

        int num = (int) (Math.random() * 5 + 1);

        switch (num) {

            case 1:
                System.out.println("hola");
                break;

            case 2:
                System.out.println("Que tal??");
                break;

            case 3:
                System.out.println("¡Buenos dias!");
                break;

            case 4:
                System.out.println("¡Buenas tardes!");
                break;

            case 5:
                System.out.println("¡Buenas noches!");
                break;

        }
    }
}
