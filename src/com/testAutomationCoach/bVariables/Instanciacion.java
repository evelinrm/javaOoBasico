package bVariables;

import aAbstraccion.Articulo;	//llama clase Articulo de paquete de abstraccion
import aAbstraccion.Perro;	//llama clase Perro de paquete de abstraccion

public class Instanciacion { //crea clase Instanciacion
	//Clases Estaticas
    static Perro fido;	//crea un objeto de la clase perro
    static Articulo tablet;	//crea objeto de la clase Articulo
    static int numeroEstudiantes;	//crea variable entera numeroEstudiantes

    public static void main(String[] args) {	//psvm
        //cuanta memoria ocupan estas variables?
        char x = 'N';	//crea variable x y le asigna el valor de la letra N
        int numeroTotalEstudiantes = numeroEstudiantes + 3;	//crea variable y le asigna el valor de numeroEstudiantes + 3
        String saludo = "Hola";	//crea variable de tipo cadena y le asigna Hola
        String fraseBenito = "El respeto al derecho ajeno es la paz";	//crea variable de tipo cadena y le asigna una frase como valor

        Perro firulais = new Perro();	//se crea nuevo objeto de la clase perro
        fido.ladrar();	//hacen que el objeto fido ladre
        firulais.ladrar();	//hacen que el objeto firulais ladre
        //tablet.toString();	//convierten objeto tablet a string
        Articulo laptop = new Articulo();	//crean nuevo objeto de tipo articulo 
        laptop.toString();	//convierten laptop a string
    }
}
