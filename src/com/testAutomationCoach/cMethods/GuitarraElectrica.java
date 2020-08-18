package cMethods;

public class GuitarraElectrica {
	//vars
	private String marca;
	private String [] lFamosos;
	
	//metodos
	
	public void listarFamosos() {
		String [] lFamosos;
		lFamosos = new String[4];
		lFamosos[0]= "Adam Levine";
		lFamosos[1]= "Axel Rose";
		lFamosos[2]= "Mick Jagger";
		lFamosos[3]= "Freddy Mercury";
		System.out.println("Famosos: ");
		for(int i = 0; i<lFamosos.length; i++) {
			System.out.println(lFamosos[i]);
		}
	}
	
	GuitarraElectrica(String marca){
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}
}
