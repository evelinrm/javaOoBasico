package bVariables;

import aAbstraccion.Cancion;	//imoprtar clase cancion del paquete abstraccion

public class AsignacionReferencia { 	// crear clase AsignacionReferencia 
    public static void main(String[] args) {	//psvm
        //cuantas referencias hay? cuantos objetos?	
        Cancion elTriste = new Cancion();	// 1 objeto	
        Cancion almohada = new Cancion();	// 2 objeto
        Cancion x = elTriste;	// 1 asignacion
        Cancion y = new Cancion();	// 3 objeto 
        y = almohada;	// 2 asignacion
        elTriste = null;	// 3 asignacion
        x = elTriste;	// 4 asignacion
    }
}
