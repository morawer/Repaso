abstract class Persona {

    // Creamos las propiedades de la clase Persona.

    private String nif;
    private String nombre;
    private String direccion;
    private String telefono;

    // Creamos los constructores.

    public Persona() {
    }

    public Persona(String nif, String nombre, String direccion, String telefono) {
        this.nif = nif;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Creamos los get y set de cada propiedad de Persona.

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Creamos el metodo "llamar" el cual recoje un nombre a llamar como argumento.

    public String llamar(Persona p) {

        return this.nombre + " llamando a " + p.nombre;
    }

    /*
     * Se crea el metodo trabajar(), es abstracto. Despues cada clase derivada
     * modificará este metodo
     */

    public abstract String trabajar();

    @Override
    public String toString() {
        return "Persona [direccion=" + direccion + ", nif=" + nif + ", nombre=" + nombre + ", telefono=" + telefono
                + "]";
    }

}