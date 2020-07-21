import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {

        int opc = 0;

        Scanner sc = new Scanner(System.in);

        ArrayList<Bebida> bebidas = new ArrayList<Bebida>();

        while (opc != 5) {

            System.out.println("*** MÁQUINA DE BEBIDAS ****");
            System.out.println("---------------------------");
            System.out.println("1. Coca Cola ------- 1.30 €");
            System.out.println("2. Fanta Naranja --- 1.20 €");
            System.out.println("3. Fanta Limón ----- 1.20 €");
            System.out.println("4. Agua ------------ 1.00 €");
            System.out.println("5. Apagar máquina");
            System.out.println("---------------------------");
            System.out.println("¿Qué opción elige?");

            opc = sc.nextInt();

            switch (opc) {

                case 1:
                    Bebida beb1 = new Bebida("Coca cola", 1.30f);
                    bebidas.add(beb1);
                    break;

                case 2:
                    Bebida beb2 = new Bebida("Fanta Naranja", 1.20f);
                    bebidas.add(beb2);
                    break;

                case 3:
                    Bebida beb3 = new Bebida("Fanta Limón", 1.20f);
                    bebidas.add(beb3);
                    break;

                case 4:
                    Bebida beb4 = new Bebida("Agua", 1.00f);
                    bebidas.add(beb4);
                    break;

                case 5:
                    System.out.println("Su ticket, hasta pronto.");
                    System.out.println(bebidas.toString());

                    float precioTotal = 0;
                    for (Bebida bebida : bebidas) {

                        precioTotal += bebida.getPrecio();

                    }

                    System.out.println("El total de la compra es de: " + precioTotal + " euros.");
                    break;

            }

        }

        sc.close();

    }
}
