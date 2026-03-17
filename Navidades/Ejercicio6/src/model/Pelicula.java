package model;

public class Pelicula {

    private String titulo;
    private String director;
    private int duracion;
    private int anio;
    private double calificacion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int duracion, int anio, double calificacion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.anio = anio;
        if (calificacion >= 0 && calificacion <= 10) {
            this.calificacion = calificacion;
        }else  {
            this.calificacion = 0;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        if (calificacion >= 0 && calificacion <= 10) {
            this.calificacion = calificacion;
            return;
        }
        System.out.println("Nota no valida, intentalo de nuevo");
    }
}
