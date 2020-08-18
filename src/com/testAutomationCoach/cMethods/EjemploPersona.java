package cMethods;

public class EjemploPersona {
	public static void main(String[] args) {
		Persona mike = new Persona("Miguel", 1.60, 80.0, 100);
		
		mike.comer();
		mike.comer();
		mike.setNivelHambre(30);
		mike.comer();
		mike.comer();
	}

}
