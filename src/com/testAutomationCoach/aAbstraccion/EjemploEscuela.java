package aAbstraccion;

public class EjemploEscuela {

	public static void main(String[] args) {
		
		Persona dire = new Persona();
		dire.nombre = "Liliana";
		dire.sex = 'F';
		dire.cargo = "Directora";
		
		Persona profe = new Persona();
		profe.cargo = "Profesor";
		profe.nombre = "Juan";
		profe.sex = 'M';
		
		Inmobiliario mesa = new Inmobiliario();
		mesa.idInventario = "m001";
		mesa.tipo = "";
	}

}