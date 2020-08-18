package cMethods;

import libs.Input;	//importa libreria input

public class EjemploCuadrado {	//crea Ejemplo de clase cuadrado

	public static void main(String[] args) {	//psvm
		Cuadrado c1 = new Cuadrado(3);	// crea objeto cuadrado, con la medida de su lado
		System.out.println("c1: " + c1);	//imprime valor del lado del cuadrado 1
		
		//este cuadrado es demasiado grande para sacar su area.  
		Cuadrado c2 = new Cuadrado(130000000);	// crea objeto cuadrado, con la medida de su lado
		System.out.println("c2: " + c2);	//imprime valor del lado del cuadrado 2
		Input.print(Integer.MAX_VALUE);	

	}

}
