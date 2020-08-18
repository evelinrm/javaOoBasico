package bVariables;

class Book {	//crea clase libro y crea atributos
	String title;	
    String author;
//}

//class BookTestDrive {	//crea clase de BookTestDrive	
    public static void main(String [] args) {	//main

        Book [] myBooks = new Book[3];	//Crea lista de 3 libros 
        int x = 0;	//crea e inicializa variable x en 0
        
        myBooks[0] = new Book();
        myBooks[1] = new Book();
        myBooks[2] = new Book();
        
        myBooks[0].title = "The Grapes of Java";	//asigna titulo al libro 0
        myBooks[1].title = "The Java Gatsby";		//Asigna titulo al libro 1
        myBooks[2].title = "The Java Cookbook";		//Asigna titulo al libro 2
        myBooks[0].author = "bob";					//Asigna autor al libro 0
        myBooks[1].author = "sue";					//Asigna autor al libro 1
        myBooks[2].author = "ian";					//Asigna autor al libro 2

        while (x < 3) {		//crea ciclo mientras que x es menor que 3
            System.out.print(myBooks[x].title);		//imprime titulo del libro x
            System.out.print(" by ");				//imprime by
            System.out.println(myBooks[x].author);	//imprime autor del libro x
            x = x + 1;								//incrementa en 1 el contador x
        }
    }
}
