package ejer_04.src;

/* Realiza un programa en Java que vaya generando números al azar entre 1 y 10. 
Cada número generado debe mostrarse en pantalla, terminando cuando se genere el número 7. 
El programa también deberá informar sobre cuántos números se han tenido que generar para obtener el 7.*/

public class App {
    public static void main(String[] args) throws Exception {

        int acum = 0;

        int num = (int) (Math.random() * 10 + 1);

        while (num != 7) {

            acum++;

            System.out.println(num);

            num = (int) (Math.random() * 10 + 1);

        }

        System.out.println("El numero de intentos es de: " + acum);
        System.out.println("Ya salió el numero " + num);

    }
}
