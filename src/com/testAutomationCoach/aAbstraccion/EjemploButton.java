package aAbstraccion;

import libs.Input;

public class EjemploButton {

	public static void main(String[] args) {
		Button btn =  new Button();
		
		btn.color = "Rojo";
		btn.label = "Open";
		btn.pixelesX = 1;
		
		btn.click();
		btn.press();
		btn.release();
		
		Input.print("Color: " + btn.color + "\n");
		Input.print("Label: " + btn.label + "\n");
		Input.print("px on X: " + btn.pixelesX + "\n");
		
	}

}
