package eHerencia.animals;

public class EjemploAnimales {	//clase de ejemplo Animales

    public static void main(String[] args) {	//psvm
        Animal ani = new Animal();	//crea nuevo objeto animal llamado "ani"
        ani.hacerRuido();	//ani hace ruido
        ani.dormir();	//ani duerme
        //etc
        
        Lobo lupus = new Lobo();	//crea nuevo objeto lobo llamado "lupus"
        lupus.comer();	//lupus come
        lupus.hacerRuido();	//lupus hace ruido
        
        Leon rey = new Leon();	//crea nuevo objeto leon llamado "rey"
        rey.hacerRuido();	//rey hace ruido
        rey.dormir();	//rey duerme

        //polyAnimal
        Animal chicoBestia = new Gato();	//crea objeto animal y le asigna la subclase gato
        chicoBestia.hacerRuido();	//chicoBestia haceRuido de gato
        chicoBestia.comer();	//chicoBestia come como gato

        chicoBestia = new Perro();	//al objeto animal chico bestia, le asigna la subclase perro
        chicoBestia.hacerRuido();	//chicoBestia haceRuido de perro
        chicoBestia.comer();	//chicoBestia comer de perro

        Animal[] zoologico = new Animal[5];	//arreglo de animal 
        zoologico[0] = new Leon(); 	//en la posicion 0 se coloco un nuevo objeto leon
        zoologico[1] = new Jaguar();	//en la posicion 1 se coloco un nuevo objeto jaguar
        zoologico[2] = new Hipopotamo();	//en la posicion 2 se coloco un nuevo objeto hipopotamo
        zoologico[3] = new Lobo();	//en la posicion 3 se coloco un nuevo objeto lobo
        zoologico[4] = new Puma();	//en la posicion 4 se coloco un nuevo objeto puma

        for(Animal poly: zoologico) {	//ciclo Animal poly, recorre arreglo zoologico
            poly.hacerRuido();
            poly.comer();
            //poly.recorrerTerreno();
        }

    }
}
