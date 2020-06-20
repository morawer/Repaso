import com.itt.fiestas.*;

public class testFiesta {

    /*
     * Especificaciones para la versión 1:
     * 
     * El proyecto contará con una clase llamada Fiesta con la siguiente estructura:
     * 
     * 
     * Todas las propiedades serán privadas y accesibles mediante métodos get/set.
     * La propiedad tipo indica el tipo de fiesta: infantil, cumpleaños, disfraces,
     * etc. La propiedad bocadillos contiene la cantidad de bocadillos que se
     * comprarán para la fiesta. Lo mismo con las bebidas. El ejercicio propone
     * almacenar la fechaHora como String por simplificar el código. Si tienes ganas
     * de investigar puedes probar a guardarlo como un objeto de la clase
     * LocalDateTime. Se creará un constructor, que recibirá por medio de parámetros
     * el tipo, fechaHora, direccion, bebidas y bocadillos. A la propiedad invitados
     * se le asignará el valor 0 directamente. Se creará otro constructor que no
     * reciba ningún parámetro. Asigna a cada propiedad valores inventados. El
     * método consultar() retornará una cadena con todos los datos de la fiesta. El
     * método invitar() sumará 1 al contador de invitados. El método
     * cancelarInvitación() restará 1 al contador de invitados. El método
     * precioFiesta() retornará el precio de la fiesta calculado de la siguiente
     * forma: 5 euros por cada invitado, 2 euros por cada bebida y 3 euros por cada
     * bocadillo. Crea una clase Principal (con método main) donde crearás varios
     * objetos de la clase Fiesta utilizando varios constructores distintos. Pon en
     * práctica todos los métodos que has creado (invitar, consultar,
     * cancelarInvitación y precioFiesta).
     * 
     * Especificaciones para la versión 2:
     * 
     * Crea un atributo estático llamado contadorFiestas, cuyo valor se incrementará
     * en una unidad cada vez que se construya un nuevo objeto Fiesta. Sitúa la
     * clase Fiesta en el paquete com.itt.fiestas. Sobrecarga el método invitar para
     * que el usuario pueda realizar más de una invitación al mismo tiempo indicando
     * el número de invitados como argumento. Modifica la clase Principal de modo
     * que puedas poner en práctica los cambios introducidos en esta versión 2.
     * 
     */
    public static void main(final String[] args) throws Exception {

        fiesta fiesta1 = new fiesta("infantil", "12/08/2020", "Plaza la coruña", 4, 2);
        fiesta fiesta2 = new fiesta("cumpleaños", "15/09/2020", "calle galicia", 10, 8);

        fiesta1.invitar();
        fiesta1.invitar();
        fiesta1.invitar();
        fiesta1.cancelarInvitacion();
        fiesta1.setBebidas(8);

        fiesta2.invitar();
        fiesta2.invitar();


        System.out.println(fiesta1.toString()); 

        System.out.println(fiesta1.precioFiesta());

        System.out.println(fiesta2.toString());

        System.out.println(fiesta.acumulado()); 
        
        

    }



}
