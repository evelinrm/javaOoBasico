package eHerencia.doctores;

public class Doctor extends ProfesionalDeSalud{

    private String especialidad;

    public void prescribirMedicina() {}

    public String getEspecialidad() {
        return this.especialidad;
    }
    public void setEspecialidad(String especialidad) {
    	this.especialidad = especialidad;
    }
}
