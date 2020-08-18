package dEncapsulacion;

import libs.Input;

public class Automovil { // La clase publica automovil fue creada
	
	//Atributos	privados
	private String marca;
	private double velocidadActual;
	private double maximaVelocidad;
	private String tipoDeTransmision;
	private int numDePuertas;
	private int numDeLlantas;
	
 	Automovil() { 	// se crea objeto Automovil y asigna variables directamente 
		marca = "Ford";		//asigna Ford como marca
		velocidadActual = 0.0;		//asigna 0.0 como velocidad actual
		maximaVelocidad = 200.0;	//asigna 200 como maxima velocidad
		tipoDeTransmision = "Manual";	//asigna Manual como tipo de transmision
		numDePuertas = 2;	//asigna 2 como numero de puertas
		numDeLlantas = 4;	//asigna 4 como numero de llantas
	}
	
	Automovil(String marca, double maximaVel, String tipoTransmision, int numPuertas, int numLlantas) { //se crea objeto Automovil y asigna variables por funcion
		this.marca = marca;		//usa this.para especificar que sera en este objeto
		this.velocidadActual = 0.0;
		this.maximaVelocidad = maximaVel;
		this.tipoDeTransmision = tipoTransmision;
		this.numDePuertas = numPuertas;
		this.numDeLlantas = numLlantas;
	}
	
	//Comportamiento publicos
	public void acelerar() { 	//crea behaviour acelerar
		Input.print("run run\n");	//imprime run run
		this.velocidadActual += 5.0; 	//en este comportamiento aumenta la velocidad actual + 5.0
	}
	
	public void frenar() { 		//crea behaviour frenar
		Input.print("Screeeeech!\n");	//imprime screeech!
		this.velocidadActual = 0; 		// en este comportamiento reduce la velocidad actual a 0
	}
	
	public void retroceder() {	//crea behaviour retroceder
		Input.print("piii piii piii piii\n");	//imprime piii pii pii
		this.velocidadActual -= -5;		//en este comportamiento reduce la velocidad actual - 5
	}
	
	public double getVelocidad() { //crea behaviour getVelocidad
		return velocidadActual; 	//regresa el valor de velocidad Actual
		
	}
}
