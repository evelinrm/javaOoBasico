package cMethods;

public class EjemploPerroB {	// clase publica de ejemplo de perro
    public static void main(String[] args) {	//
        PerroB marmaduke = new PerroB();	//crea objeto perro llamado marmaduke
        marmaduke.tamanio = 60.1;	// le asigna un tamaño de 60.1
        marmaduke.ladrar();	//hace que ladre

        PerroB pastorAleman = new PerroB();	//crea objeto perro llamado pastorAleman
        pastorAleman.tamanio = 45.9;	//le asigna un tamaño de 45.9
        pastorAleman.ladrar();	//lo hace ladrar

        PerroB pug = new PerroB();	//crea objeto perro llamado pug
        pug.tamanio = 15.0;	// le asigna tamaño de 15
        pug.ladrar();	//lo hace ladrar

        pug.ladrar(10);	//lo hace ladrar 10 veces
    }
}
