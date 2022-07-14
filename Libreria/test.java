
import java.util.Scanner;

import Libro.Libro;
import Coleccion.Coleccion;

public class test 
{

    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            Libro Libro = new Libro("Don quijote", "Cervantes", 1000000, 2000);
            Libro coleccion = new Libro();

            
            System.out.print("Introduce titulo: ");
            String titulo = sc.nextLine();
            System.out.print("Introduce autor: ");
            String autorUno = sc.nextLine();
            System.out.print("Introduce autor: ");
            String autorDos = sc.nextLine();
            System.out.print("Numero de libros: ");
            int NumeroLibros = sc.nextInt();
            System.out.println("Introduce la fecha de publicacion: ");
            int anioPublicacion = sc.nextInt();
   
            

   
            coleccion.setTitulo(titulo);
            coleccion.setAutorUno(autorUno);
            coleccion.setAutorDos(autorDos);
            coleccion.setNumeroLibros(NumeroLibros);
            coleccion.setAnioPublicacion(anioPublicacion);

            System.out.println("Libro 1:");
            System.out.println("Titulo: " + Libro.getTitulo());
            System.out.println("Autor: " + Libro.getAutorUno());
            System.out.println("numero de libros: " + Libro.getNumeroLibros());
            System.out.println("Publicacion: " + Libro.getAnioPublicacion());
            System.out.println();

            //mostrar los datos del objeto libro1
            System.out.println("Libro 2:");
            System.out.println("Titulo: " + coleccion.getTitulo());
            System.out.println("Autor uno: " + coleccion.getAutorUno());
            System.out.println("Autor dos: " + coleccion.getAutorDos());
            System.out.println("numro de libros: " + (coleccion.getNumeroLibros()));
        }

        System.out.println();
    }
}
