public class Administrativo extends Persona {

    private String tareas;

    // Creamos los constructores

    public Administrativo(String tareas) {
        this.tareas = tareas;
    }

    public Administrativo(String nif, String nombre, String direccion, String telefono, String tareas) {
        super(nif, nombre, direccion, telefono);
        this.tareas = tareas;
    }

    public String getTareas() {
        return tareas;
    }

    public void setTareas(String tareas) {
        this.tareas = tareas;
    }

    @Override
    public String trabajar() {
        return "El administrativo " + getNombre() + " va a realizar estas tareas: " + this.tareas;
    }

    public String gestionarMatriculas() {
        return getNombre() + " va a gestionar matriculas";
    }

    @Override
    public String toString() {
        return super.toString() + "Tareas = " + this.tareas;
    }



    
    
}