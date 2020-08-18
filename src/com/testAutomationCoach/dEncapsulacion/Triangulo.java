package dEncapsulacion;

public class Triangulo { // crea clase publica de Triangulo
	
	//propiedades o campos ,  atributos privados
	private int base;
	private int altura;
	
	public Triangulo(int base, int altura) { 	//Crea funcion publica para asignar valores al objeto
		this.base = base; 	//asigna varaible para la base
		this.altura = altura;	//asigna variable para la altura
	}
	
	//metodos o comportamiento
	public int sacarArea() {	//crea metodo sacarArea publico
		int area= (this.base*this.altura)/2; 	//hace operacion para obtener area
		return area;	//regresa resultado de area
	}
	public int sacarPerimetro() { 	//crea metodo sacarPerimetro publico
		int perimetro = this.base*3;		//hace operacion para obtener perimetro
	    return perimetro;	//regresa resultado de area
	}

	public int getBase() { //crea metodo getBase publico
		return base; 	//regresa base;
	}

	public void setBase(int base) { 	//crea metodo publico para configurar base
		this.base = base; 	//en esta base, entra el parametro
	}

	public int getAltura() { 	// crea metodo publico para obtener altura
		return altura;	//regresa altura
	}

	public void setAltura(int altura) { 	// crea metodo publico para configurar altura
		this.altura = altura;	//regresa base
	}
	
	public String toString() {		//crea metodo publico para regresar esta base y altura como string
		return "Base es " + this.base + " Altura es "+ this.altura; 	//String con base y altura
	}

}
