package bVariables;

public class IntArray {	//crea clase de IntArray
    public static void main(String[] args) {	//psvm
        int[] calificaciones;	// crea arreglo de enteros
        calificaciones = new int[5];	//asigna numero de posiciones del arreglo
        calificaciones[0] = 89;	// asigna valores a cada una de las posiciones del arreglo
        calificaciones[1] = 92;
        calificaciones[2] = 83;
        calificaciones[3] = 100;
        calificaciones[4] = 100;

        int len = calificaciones.length;	//crea variable y asigna valor de la longitud del arreglo
        System.out.println("Hay " + len + " calificaciones.");	//imprime el valor de la longitud del arreglo en una cadena

        //sacar promedio?
        int promedio = sacarPromedio(calificaciones);	//crea variable promedio y asigna su valor mediante el metodo de abajo

    }

    private static int sacarPromedio(int[] calificaciones) { 	//metodo para sacar promedio
        //implement
        return -1;	//regresa -1, no esta listo
    }
}
