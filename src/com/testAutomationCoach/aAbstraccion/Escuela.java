package aAbstraccion;

public class Escuela {
	Edificio [] edificios;
	Persona [] personal;
}
		
	class Edificio{ //Relacion has-a 
		int nEdificio;
		double areaEdificio;
		Salon[] salones;
	}
	
	class Salon {
		String id;
		int capacidadButacas;
		Inmobiliario[] muebles;
	}
	

	class Supervisor extends Persona{
		Persona[] supervisados;
	}
	class Profesor extends Persona{
		
	}
	
	class Director extends Supervisor{
		
	}
	class Alumnos{
		
	}
	class SubDirector{
		
	}
	class Prefecto extends Supervisor{
		
	}
	
	class Inmobiliario{
		String idInventario;
		String tipo;
	}
	class Mesa{ //Relacion is-a
		
	}
	class Silla{
		
	}
	class Pizarron{
		
	}
	class Pintarron{
		
	}
	
