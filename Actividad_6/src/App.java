public class App {
    public static void main(String[] args) throws Exception {

        Persona pers1 = new Profesor("4952347", "Alfredo", "Calle del percebe", "98654321", "Matematicas");
        Persona pers2 = new Alumno("789879879", "Alicia", "calle tiktok", "654642354", "1º de Bachillerato");

        System.out.println(pers1.llamar(pers2));
        System.out.println(((Profesor)pers1).ponerNotas());
        System.out.println(pers2.trabajar());
        System.out.println(((Alumno)pers2).toString());
    }

}