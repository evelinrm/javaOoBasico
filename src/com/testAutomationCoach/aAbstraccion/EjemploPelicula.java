package aAbstraccion;

import libs.Input;

public class EjemploPelicula {

	public static void main(String[] args) {
		
		Pelicula movie = new Pelicula();
		
		movie.name = "Mulan";
		movie.genre = "Child's movie";
		movie.duration = 2.5;
		
		movie.record();
		movie.edit();
		movie.play();
		
		Input.print("Name: " + movie.name + "\n");
		Input.print("Genre: " + movie.genre + "\n");
		Input.print("Duration: " + movie.duration + "\n");

	}

}
