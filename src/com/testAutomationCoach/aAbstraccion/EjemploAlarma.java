package aAbstraccion;

import libs.Input;

public class EjemploAlarma {

	public static void main(String[] args) {
		Alarma wakeUp = new Alarma();
		wakeUp.horaActual = "10:46 PM";
		wakeUp.horaAlarma = "00:08 AM";
		wakeUp.sonido = "ring, ring";
		
		wakeUp.mostrarHora();
		wakeUp.sonarAlarma();
		wakeUp.postponerAlarma();
		wakeUp.apagarAlarma();
		
		Input.print("Hora Actual: " + wakeUp.horaActual + "\n");
		Input.print("horaAlarma: " + wakeUp.horaAlarma + "\n");
		Input.print("Sonido: " + wakeUp.sonido + "\n");

	}

}
