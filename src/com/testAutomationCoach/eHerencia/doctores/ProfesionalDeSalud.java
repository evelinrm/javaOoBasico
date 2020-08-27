package eHerencia.doctores;

public class ProfesionalDeSalud { // clase profesional de la salud
	//declarar atributos
    String nombre;	
    String profesion;
    
    public ProfesionalDeSalud(String nombre, String profesion) {	//asignacion de atributos
    	this.nombre = nombre;	
    	this.profesion = profesion;
    }
    public ProfesionalDeSalud() {}
    
    public void tratarPaciente() {}	//comportamiento tratar paciente

    public String getNombre() {	//comportamiento get nombre,
        return nombre;	//retorna nombre
    }

    public void setNombre(String nombre) {	//comportamiento set nombre,
        this.nombre = nombre;	//Determina el nombre 
    }

    public String getProfesion() {	//comportamiento get profesion,
        return profesion;	//retorna profesion
    }

    public void setProfesion(String profesion) {	//comportamiento set profesion,
        this.profesion = profesion;	//Determina el profesion
    }


}
