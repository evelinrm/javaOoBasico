package cMethods;

import libs.Input;

public class EjemploGuitarraElectrica {

	public static void main(String[] args) {
		
		GuitarraElectrica ge = new GuitarraElectrica("Fender");
		Input.print("Marca: " + ge.getMarca() + "\n");
		ge.listarFamosos();
	}
}
