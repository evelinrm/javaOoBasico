package eHerencia.animals;

import libs.Coordenadas;

import java.io.File;

public class Animal { 	//crea clase animal
	//declarar atributos
	//has-a?
	private File picture; //archivo	
	private char comida; //Carne o Vegetales o ambos
	private int nivelHambre; //1-100
	private String habitat; //selva, bosque, desierto, etc.
	private Coordenadas location;
	
	//behavior
	public void hacerRuido() {}
	public void comer() {}
	public void dormir() {}
	public void recorrerTerreno() {}
}
