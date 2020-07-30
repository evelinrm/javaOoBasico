package aAbstraccion;

import libs.Input;

public class EjemploCarrito {

	public static void main(String[] args) {
		
		CarritoDeCompras cart = new CarritoDeCompras();
		
		cart.color = "Red";
		cart.material = "Steel";
		cart.size = 1.5;
		
		cart.take();
		cart.fill();
		cart.empty();
		
		Input.print("Color: " + cart.color + "\n");
		Input.print("Material : " + cart.material + "\n");
		Input.print("Size: " + cart.size + "\n");
		
	}

}
