package dEncapsulacion;

public class EjemploAutomovil {

	public static void main(String[] args) { //crea Main
		Automovil a1 = new Automovil(); //crea automovil a1 con variables default de automovil()
		a1.acelerar();		//lo acelera	
		a1.frenar();		//lo frena
		a1.retroceder();	//lo hace retroceder 

		Automovil a2 = new Automovil("Chrysler", 250.0, "Automatico", 5, 4); 	//crea automovil a2 con variables asignadas
		a2.acelerar(); //lo acelera
		a2.frenar(); //lo frena
		a2.retroceder(); //lo hace retroceder
	}

}
