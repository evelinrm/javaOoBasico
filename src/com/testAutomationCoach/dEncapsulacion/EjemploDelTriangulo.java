package dEncapsulacion;

import libs.Input;

public class EjemploDelTriangulo { 	//crear clase publica

	public static void main(String[] args) { 	//main
		Triangulo t = new Triangulo(5,3);	//crear nuevo objeto t con valores
		
		System.out.println("El area es " + t.sacarArea());	//Imprimir area de t
		System.out.println("El perimetro es " + t.sacarPerimetro());	//Imprimir perimetro de t
		System.out.println(t); 
		
		Input.print(Double.MAX_VALUE + "\n");
		Input.print(Float.MAX_VALUE);
	}
}
