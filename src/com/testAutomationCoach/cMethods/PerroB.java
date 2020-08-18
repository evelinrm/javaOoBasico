package cMethods;

public class PerroB {	//crea clase publica de perro
    //variables de instancia, tamano, raza, nombre
    public double tamanio;	//crea variables publicas de perro
    public String raza;
    public String nombre;

    //comportamiento: ladrar, juguetear, comer, etc.
    public void ladrar() {	//crea comportamiento ladrar
        if(tamanio > 60.0) {	//si el tamaño es mayor de 60
            libs.Input.print("woof, woof!\n");	//imprime woof, woof
        } else if( tamanio > 20 ) {	// si el tamaño es mayor de 20
            libs.Input.print("guau, guau!\n");	//imprime guau, guau
        } else {	//si el tamaño es menor de 20
            libs.Input.print("yip, yip!\n");	//imprime yip, yip
        }
    }

    public void ladrar(int numLadridos) {	//crea comportamiento ladrar con numero de ladridos
        for(int i = 0; i < numLadridos; i++) {	//ciclo que repite mientras que el contador es menor que el numero de ladridos.
            ladrar();	//ladra numero de veces en las que se corre el ciclo
        }
    }

    public double getTamanio() {	//metodo para obtener tamaño
        return tamanio;	//regresa tamaño
    }

    public void setTamanio(double tamanio) {	//metodo para configurar el tamaño
        this.tamanio = tamanio;	//asignar valor a este tamaño
    }

    public String getRaza() {	//metodo para obtener raza
        return raza;	//regresa raza
    }

    public void setRaza(String raza) {	//metodo para configurar la raza
        this.raza = raza;	//asignar valor a esta raza
    }

    public String getNombre() {	//metodo para obtener nombre
        return nombre;	//regresa nombre
    }

    public void setNombre(String nombre) {	//metodo para configurar el nombre
        this.nombre = nombre;	//asignar valor a este nombre
    }
}
