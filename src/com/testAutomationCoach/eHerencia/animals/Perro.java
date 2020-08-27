package eHerencia.animals;

public class Perro extends Canino {	//clase perro extiende clase canino

	public void hacerRuido() {	//modifica comportamiento hacerRuido en esta clase
		System.out.println("Guau guau!");
	}
	public void comer() {	//modifica comportamiento comer en esta clase
		System.out.println("Como Dowchow y carne de pollo");
	}
}
