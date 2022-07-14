package Coleccion;

import Libro.Libro;

public class Coleccion extends Libro
{
    private String titulo;
    private String autorUno;
    private String autorDos;
    private int NumeroLibros;
    private int anioPublicacion;
    private int coleccion;

    //constructor
    public Coleccion() 
    {
    }

    public void Libro(String titulo, String autorUno, String autorDos, int NumeroLibros,int anioPublicacion, int coleccion) 
    {                                    
        this.titulo = titulo;
        this.autorUno = autorUno;
        this.autorDos = autorDos;
        this.NumeroLibros = NumeroLibros;
        this.anioPublicacion = anioPublicacion;
        this.coleccion = coleccion;
    }



    public String getAutorUno() 
    {
        return autorUno;
    }

    public void setAutorUno(String autorUno) 
    {
        this.autorUno = autorUno;
    }
    public String getAutorDos()
    {
        return autorDos;
    }
    public void setAutorDos(String autorDos)
    {
        this.autorDos = autorDos;
    }

    public int getNumeroLibros() 
    {
        return NumeroLibros;
    }

    public void setNumeroLibros(int NumeroLibros) 
    {
        this.NumeroLibros = NumeroLibros;
    }
    public String getTitulo() 
    {
        return titulo;
    }

    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }

    public int getAnioPublicacion()
    {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion)
    {
        this.anioPublicacion = anioPublicacion;
    }
    public void setColeccion(int coleccion) 
    {
        this.coleccion = coleccion;
    }

    public int getcoleccion()
    {
        return coleccion;
    }

}
