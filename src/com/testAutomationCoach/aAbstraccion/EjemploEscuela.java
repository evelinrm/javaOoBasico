package aAbstraccion;

public class EjemploEscuela {

	public static void main(String[] args) {
		
		Director dire = new Director();
		dire.nombre = "Liliana";
		dire.sex = 'F';
		dire.cargo = "Directora";
		
		Profesor profe = new Profesor();
		profe.cargo = "Profesor";
		profe.nombre = "Juan";
		profe.sex = 'M';
		
		dire.supervisados = new Persona [50];
		dire.supervisados[0] = profe;
		
		Inmobiliario mesa = new Inmobiliario();
		mesa.idInventario = "m001";
		mesa.tipo = "mesa";
		
		Inmobiliario silla = new Inmobiliario();
		silla.idInventario = "s001";
		silla.tipo = "silla";
		
		Salon primeroA =  new Salon();
		primeroA.id = "1A";
		primeroA.capacidadButacas = 40;
		Inmobiliario [] muebles1A = new Inmobiliario[100];
		muebles1A[0] = mesa;
		muebles1A[1] = silla;
		primeroA.muebles = muebles1A;
		
		Edificio uno = new Edificio();
		uno.areaEdificio = 1000;
		uno.nEdificio = 1;
		uno.salones = new Salon [12];
		uno.salones[0] = primeroA;
		
		Escuela luisDonaldo = new Escuela();
		luisDonaldo.edificios = new Edificio[3];
		luisDonaldo.personal = new Persona[200];
		
		luisDonaldo.edificios[0] = uno;
		luisDonaldo.personal[0] = dire;
		luisDonaldo.personal[1] = profe;
	}

}