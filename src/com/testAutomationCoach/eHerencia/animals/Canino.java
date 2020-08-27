package eHerencia.animals;
					//is-a-?
public class Canino extends Animal { 	//crea clase canino que extiende clase animal

    public void recorrerTerreno() {		//modifica comportamiento de recorrerTerreno para esta clase
        System.out.println("Soy animal social y ando en manadas.");
    }
}
