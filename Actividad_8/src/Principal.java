public class Principal {
    public static void main(String[] args) throws Exception {
        
        Alumno alu1 = new Alumno("Carmen Torres", 33215);
		alu1.calificar("Matematicas", 70);
		alu1.calificar("Lengua", 55);
		alu1.calificar("Ingles", 93);
		alu1.calificar("Fisica", 82);
		alu1.calificar("Ed. Fisica", 82);
		alu1.calificar("Biologia y Geologia", 58);
		System.out.println(alu1);
		System.out.println(alu1.getCalificaciones());
        System.out.println("NOTA MEDIA: " + alu1.notaMedia());
        
    }
}
