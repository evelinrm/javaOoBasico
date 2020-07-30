package aAbstraccion;

import libs.Input;

public class EjemploCancion {

	public static void main(String[] args) {
		
		Cancion song = new Cancion();
		
		song.title = "baby";
		song.artist = "JB";
		song.duration = 3;
		
		song.record();
		song.edit();
		song.play();
		
		Input.print("Title: " + song.title + "\n");
		Input.print("Artist: " + song.artist + "\n");
		Input.print("Duration: " + song.duration + "\n");

	}
}
