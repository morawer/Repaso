public class Alumno extends Persona {

    private String curso;

    public Alumno(String curso) {
        this.curso = curso;
    }

    public Alumno(String nif, String nombre, String direccion, String telefono, String curso) {
        super(nif, nombre, direccion, telefono);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String trabajar() {
        return getNombre() + " va a estudiar " +this.curso;
    }

    public String hacerExamen() {
        return getNombre() + "va a hacer su examen";
    }

    @Override
    public String toString() {
        return "Alumno [curso=" + curso + "]";
    }

    

    

}
    
