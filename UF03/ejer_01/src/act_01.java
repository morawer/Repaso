package ejer_01.src;

/*Declara una variable llamada num1 y asígnale un valor al azar del 1 al 20.
 Luego declara otra variable llamada num2. 
 Si num1 está comprendido entre 5 y 15 (ambos inclusive) asigna a num2 el 
 resultado de la operación num1+15, de lo contrario asigna a num2 el resultado 
 de la operación num1+5. Al final muestra en pantalla el valor de ambas variables. */

public class act_01 {
    public static void main(final String[] args) {

        int num1;
        int num2;

        num1 = (int) (Math.random() * 20 + 1);

        if (num1 >= 5 && num1 <= 15) {

            num2 = num1 + 15;

        } else {

            num2 = num1 + 5;

        }

        System.out.println("El valor de num1 es : " + num1);
        System.out.println("El valor de num2 es : " + num2);

    }

}