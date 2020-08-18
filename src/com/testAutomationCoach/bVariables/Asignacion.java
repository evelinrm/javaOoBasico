package bVariables;

public class Asignacion {	//crea clase asignacion
    public static void main(String[] args) {	//psvm
        //primitivas
        int edad;	//Declara variable edad como entera
        double salario;	//Declara variable salario como double
        boolean esAdulto;	//Declara variable esAdulto como booleana
        char inicial;	// declara variable inicial como caracter

        //inicializacion literal
        edad = 43;	// asigna valor a variable edad
        salario = 120000.00;	//asigna valor a variable salario

        //inicializacion por otra variable, expresion o metodo
        int nuevaEdad = 44;		//declara nueva vaariable entera como nueva edad y le asigna valor;
        edad = nuevaEdad;	//asigna valor de nueva edad a edad

        double aumentoSalario = salario * 1.15;		//declara nueva variable double como aumento salario y asigna valor por expresion
        esAdulto = esMayorEdad(edad);	//Se asigna valor a una variable por medio de un metodo
        inicial = "Omar".charAt(0);		//se asigna valor a variable, seleccionando el primer caracter de la palabra omar
    }

    public static boolean esMayorEdad(int edad) { //se crea metodo boolean para saber si es mayor de edad por medio de variable edad
        return edad >= 18;	// regresa true si edad es mayor o igual a 18
    }
}
