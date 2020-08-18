package bVariables;

import aAbstraccion.Perro; 	//importa clase perro del paquete abstraccion

public class DogArray {	//crea clase DogArray
    public static void main(String[] args) {	//psvm
        Perro[] perrera;	//crear arreglo de Perro 
        perrera = new Perro[12];	//la perrera sera un arreglo de perro con 12 posiciones
        perrera[0] = new Perro();	//asigna valores a las posiciones de los perros
        perrera[1] = new Perro();
        perrera[2] = new Perro();
        perrera[3] = new Perro();
        perrera[4] = new Perro();
        perrera[5] = new Perro();
        perrera[6] = new Perro();
        perrera[7] = new Perro();
        perrera[8] = new Perro();
        perrera[9] = new Perro();
        perrera[10] = new Perro();
        perrera[11] = new Perro();
        perrera[12] = new Perro();
        
        System.out.println(perrera[2]);	//imprimer el valor en la posicion 2 de la perrera
        
        perrera[0].nombre = "Solovino";	//ingresar caracteristicas del perro en la primera celda

        perrera[3] = perrera[0];	//mover al perro de la celda 0 a la celda 3
       
        perrera[0] = null;	//vaciar la celda cero

    }
}
