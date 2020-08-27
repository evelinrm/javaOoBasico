package eHerencia.doctores;

public class Doctor extends ProfesionalDeSalud{	//clase doctor extiende clase profesional de la salud

	private String especialidad;	//atributo especialidad

    public void prescribirMedicina() {}	//comportamiento prescribir medicina

    public String getEspecialidad() {	//comportamiento getEspecialidad,
        return this.especialidad;	//retorna especialidad
    }
    public void setEspecialidad(String especialidad) {	//comportamiento setEspecialidad,
    	this.especialidad = especialidad;	//determina especialidad
    }
}
