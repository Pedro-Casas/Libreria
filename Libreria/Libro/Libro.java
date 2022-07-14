package Libro;
public class Libro 
{
    private String titulo;
    private String autorUno;
    private String autorDos;
    private int NumeroLibros;
    private int anioPublicacion;

    //constructor por defecto
    public Libro() 
    {
    }

    public Libro(String titulo, String autorUno, int NumeroLibros,int anioPublicacion) 
    {                                    
        this.titulo = titulo;
        this.autorUno = autorUno;
        this.NumeroLibros = NumeroLibros;
        this.anioPublicacion = anioPublicacion;
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

}