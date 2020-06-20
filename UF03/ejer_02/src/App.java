package ejer_02.src;

/* Necesitamos contar en orden inverso de 10 en 10 desde 100 hasta 10 (100, 90, 80, …, 10). 
Realiza dos programas en Java, cada uno de ellos con dos estructuras de control distintas, 
que realicen la tarea indicada. */

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Ejercicio con 'for'");
        for (int i = 100; i >= 10; i -= 10) {
            System.out.println(i);
        }

        System.out.println("Ejercicio con 'while'");

        int num = 100;

        while (num >= 10) {
            System.out.println(num);
            num -= 10;
            
        }
    }
}
