public class Calificacion {

    private String asignatura;

    private int nota; // Valor de 0 a 100

    // Constructor que reciba argumentos para las dos propiedades

  // Métodos get/set

  

  @Override

  public String toString() {

    return getAsignatura() + ": " + getNota();

                      // Devolver una cadena de tipo: “Lengua: 55”

  }

  public Calificacion(String asignatura, int nota) {
      this.asignatura = asignatura;
      this.nota = nota;
  }

  public String getAsignatura() {
      return asignatura;
  }

  public void setAsignatura(String asignatura) {
      this.asignatura = asignatura;
  }

  public int getNota() {
      return nota;
  }

  public void setNota(int nota) {
      this.nota = nota;
  }

  

}