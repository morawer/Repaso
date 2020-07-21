public class Bebida {

    private String bebida;

    private float precio;

    public Bebida(String bebida, float precio) {

        this.bebida = bebida;

        this.precio = precio;

    }

    public float getPrecio() {

        return this.precio;

    }

    public String getBebida() {

        return this.bebida;

    }

    @Override

    public String toString() {

        return "\n Servicio [Bebida = " + bebida + ", Precio = " + precio + "€ ]";

    }

}