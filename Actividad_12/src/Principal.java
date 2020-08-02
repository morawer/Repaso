import java.io.File;

import java.util.ArrayList;

import java.util.Scanner;

public class Principal {

              static Scanner lector;

              public static void main(String[] args) {

                            lector = new Scanner(System.in);

                            ArrayList<Contacto> contactos = new ArrayList<Contacto>();

                            int opc = 0;

                            /*

                            * Comprueba si existe el fichero agenda.dat usando la clase File

                            * Si existe lee secuencialmente todos los contactos guardados y

                            * cópialos en el objeto ArrayList contactos.

                            * Si no existe el fichero no tendrás nada que hacer con el fichero

                            * por el momento.

                            */

                            while (opc!=6) {

                                         mostrarMenu();

                                         opc = lector.nextInt();

                                         lector.nextLine(); // Para recoger el retorno de carro.

                                         /*

                                        * Añade aquí una estructura switch para lograr que en

                                        * función de la opción que elija el usuario el control

                                        * del programa pase a un método u otro de los que

                                        * tendrás que implementar más abajo.

                                        */

                           }

                           /*

                           * Abre el fichero agenda.dat para escritura y guarda todos los

                           * objetos contacto que estén en la colección ArrayList contactos.

                           * Si ya existe un fichero agenda.dat deberá ser sobrescrito.

                           */

                           lector.close();

}

public static void mostrarMenu() {

              System.out.println(" AGENDA TELEFÓNICA");

              System.out.println("---------------------------------------");

              System.out.println("1. Añadir nuevo contacto");

              System.out.println("2. Borrar contacto");

              System.out.println("3. Consultar contacto");

              System.out.println("4. Listado de contactos");

              System.out.println("5. Exportar agenda a archivo de texto");

              System.out.println("6. Terminar programa");

              System.out.println("---------------------------------------");

              System.out.println("¿Qué opción eliges?");

           }

           public static void nuevoContacto(ArrayList<Contacto> contactos) {

                         /*

                         * Añade un nuevo elemento a la colección contactos.

                         * El usuario tendrá que introducir por teclado

                         * el nombre y teléfono para el nuevo contacto.

                         */

            }

            public static void borrarContacto(ArrayList<Contacto> contactos) {

                          /*

                           * Permite al usuario introducir por teclado el

                           * nombre de un contacto para después eliminarlo de la colección.

                           */

             }

             public static void consultarContacto(ArrayList<Contacto> contactos) {

                           /*

                            * Permite al usuario introducir por teclado el

                            * nombre de un contacto y muestra en pantalla

                            * su teléfono.

                            */

            }

            public static void listadoContactos(ArrayList<Contacto> contactos) {

                          /*

                           * Recorre secuencialmente la colección de contactos para mostrar

                           * un listado en pantalla.

                           */

             }

            public static void exportarContactos(ArrayList<Contacto> contactos) {

                            /*

                             * Recorre secuencialmente la colección de contactos y genera

                             * un fichero de texto llamado agenda.txt

                             */

             }

}