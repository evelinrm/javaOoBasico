package aAbstraccion;

import libs.Input;

public class EjemploArticulo {

	public static void main(String[] args) {
		Articulo article = new Articulo();
		article.description = "This is an article";
		article.size = 1000;
		article.title = "Test Article";
		
		article.crearArticulo();
		article.editarArticulo();
		article.eliminarArticulo();
		
		Input.print("Title: " + article.title + "\n");
		Input.print("Description: " + article.description + "\n");
		Input.print("Size: " + article.size + "\n");
	}

}
