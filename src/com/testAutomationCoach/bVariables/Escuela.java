package bVariables;

public class Escuela {
	
	public void grupo() {
		System.out.println("Esto es un grupo");
	}
	
	public void alumno () {
		System.out.println("Soy Alumno");
	}
	
	public void maestro() {
		Maestro maestro = new Maestro();
		System.out.println("Soy Maestro");
	}
	
	public static void main() {
		Escuela escuela = new Escuela();
		escuela.grupo();
		escuela.alumno();
		escuela.maestro();

	}
}
