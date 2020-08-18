package cMethods;

public class Persona {
	
	//vars
	private String nombre;
	private double estatura;
	private double peso;
	private int nivelHambre; // 0 = lleno, 100 = tiene mucha hambre
	
	Persona(String nombre, double estatura, double peso, int nivelHambre){
		this.nombre = nombre;
		this.estatura = estatura;
		this.peso = peso;
		this.setNivelHambre(nivelHambre);
	}
	
	public void comer() {
		if (this.getNivelHambre() < 20) {
			System.out.println("Come una ensalada");
			this.peso += 0.005;
		} else if(this.getNivelHambre() < 50) {
			System.out.println("Come un sandwich");
			this.peso += 0.010;
		} else if(this.getNivelHambre() < 78) {
			System.out.println("Come una torta ahogada");
			this.peso += 0.050;
		} else {
			System.out.println("Come en un Carls jr");
			this.peso += 0.150;
		}
	}

	public int getNivelHambre() {
		return nivelHambre;
	}

	public void setNivelHambre(int nivelHambre) {
		this.nivelHambre = nivelHambre;
	}
	
}
