import java.util.Scanner;

import com.itt.arte.*;

public class Principal {

     private static Scanner lector;

     private static Obra obra =

               new Obra("La cena de los idiotas", "Comedia", 95);

     private static Teatro teatro = new Teatro("C/ Sol, 45", 300, 2, obra, 30);

     public static void main(String[] args) {

          lector = new Scanner(System.in);

          int opc;

          do {

               opc = mostrarMenu();

               switch (opc) {

                    case 1:
                         System.out.println(obra.toString());

                         break;

                    case 2:
                         teatro.verLocalidades();

                         break;

                    case 3:
                         teatro.verLocalidadesOcupadas();

                         break;

                    case 4:

                         int fila;
                         int butaca;
                         String nombre;
                         String tlf;
                         int edad;

                         Scanner lector = new Scanner(System.in);

                         System.out.println("¿En que fila quieres sentarte? (0-4)");

                         fila = lector.nextInt();

                         System.out.println("¿En que butaca quieres sentarte? (0-9)");

                         butaca = lector.nextInt();

                         System.out.println("¿Cual es tu numero de telefono?");

                         tlf = lector.next();

                         System.out.println("¿Como te llamas?");

                         nombre = lector.next();

                         System.out.println("¿Cual es tu edad?");

                         edad = lector.nextInt();

                         Espectador e = new Espectador(nombre, tlf, edad);

                         teatro.venderLocalidad(fila, butaca, e);

                         break;

                    case 5:

                    case 6:

                    case 7:

                    case 8:

                    default:

               }

          } while (opc != 8);

          lector.close();

     }

     public static int mostrarMenu() {

          int opcion;

          System.out.println("TEATRO LA BOMBILLA DE DON BLAS");

          System.out.println("------------------------------");

          System.out.println("1. Ver la programación actual");

          System.out.println("2. Mostrar todas las localidades");

          System.out.println("3. Mostrar localidades ocupadas");

          System.out.println("4. Vender localidad");

          System.out.println("5. Cancelar localidad");

          System.out.println("6. Consultar localidad");

          System.out.println("7. Calcular recaudación");

          System.out.println("8. Terminar programa");

          System.out.println("------------------------------");

          System.out.println("¿Qué opción deseas?");

          opcion = lector.nextInt();

          return opcion;

     }

}