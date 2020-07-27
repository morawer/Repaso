import java.util.ArrayList;

public class CuentaBancaria {

    private int numeroCuenta;
    private String cliente;
    private double saldo;
    private ArrayList<Movimiento> movimientos;

    public CuentaBancaria(int numeroCuenta, String cliente) {

        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        this.saldo = 0;
        this.movimientos = new ArrayList();

               }

    public void agregarMovimiento(String concepto, double cantidad) throws NumerosRojosException {

        this.saldo = this.saldo + cantidad;
                             
        if (this.saldo < 0) {
            throw new NumerosRojosException (this.saldo);
        }

        this.movimientos.add(new Movimiento(concepto, cantidad, saldo));                    
    }

    @Override

        public String toString() {
            return "Número=" + numeroCuenta + ", Cliente=" + cliente + ", Saldo=" + saldo;
    }

    public String listarMovimientos() {

        String listado = "";

            for (Movimiento mov : this.movimientos) {
            listado = listado + mov.toString()+"\n";

        }                          
        return listado;
     }
}