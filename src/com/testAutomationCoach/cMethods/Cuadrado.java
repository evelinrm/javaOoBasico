package cMethods;

public class Cuadrado {	//crea clase publica de cuadrado	
	//Crea variables protegidas area y perimetro
	protected int area;	
	protected int perimetro;
	//Crea metodos
	public Cuadrado(int lado) {	//Metodo publico Cuadrado con valor para lado
		this.setArea(lado);	//configura area con valor para lado
		this.setPerimetro(lado);	//configura perimetro con valor lado
	}
	public int getArea() {	//metodo para obtener area
		return area;	//regresa area
	}
	private void setArea(int lado) {	//metodo para configurar area con valor de lado
		this.area = lado * lado;	//calcula esta area
	}
	public int getPerimetro() {	//metodo para obtener perimetro
		return perimetro;	//regresa perimetro
	}
	private void setPerimetro(int lado) {	//metodo para configurar perimetro
		this.perimetro = 4 * lado;	// calcula este perimetro
	}
	
	public String toString() {	//metodo para convertir resultados a string
		return "[ Area: " + this.getArea() + ", Perimetro: " + this.getPerimetro() + "]";	// regresa resultados dentro de una cadena
	}
	
}
