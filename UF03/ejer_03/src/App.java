package ejer_03.src;
/*Realiza un programa en Java que genere un número al azar entre 1 y 10. 
Una vez generado, si el número es mayor de 5 mostrará en pantalla el 
mensaje “Hoy va a ser un gran día”, de lo contrario mostrará el mensaje 
“Hoy va a ser el mejor día del mundo”. */

public class App {
    public static void main(String[] args) throws Exception {

        int num = (int) (Math.random() * 10 + 1);

        System.out.println("el valor de 'num' es de: " + num);

        if (num < 5)
            System.out.println("Hoy va a ser un gran día");
        else {
            System.out.println("Hoy va a ser el mejor día del mundo");
        }

    }
}
