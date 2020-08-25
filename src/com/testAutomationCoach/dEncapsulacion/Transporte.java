package dEncapsulacion;

public class Transporte {
	
	double velocidad;
	int nPasajeros;	
	String color;
	Persona conductor;
	Iluminacion foco;
}

class Iluminacion{
	
}

class Persona{
	
}

class Terrestres extends Transporte{
	int nLlantas;
}

class Autobus extends Terrestres{
	String modelo;
}

class Maritimos extends Transporte{
	
}

class Barco extends Maritimos{
	
}

class Aereos extends Transporte{
	
}

class Avion extends Aereos{
	int nLlantas;
}