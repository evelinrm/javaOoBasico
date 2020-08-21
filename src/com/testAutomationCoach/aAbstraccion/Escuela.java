package aAbstraccion;

public class Escuela {
	Edificio [] edificios;
	Persona [] personal;
}
		
	class Edificio{
		int nEdificio;
		double areaEdificio;
		Salon[] salones;
	}
	class Salon {
		String id;
		int capacidadButacas;
		Inmobiliario[] muebles;
	}
	class Persona {
		String nombre;
		char sex;
		String cargo;
	}
	
	class Inmobiliario{
		String idInventario;
		String tipo;
	}
	
