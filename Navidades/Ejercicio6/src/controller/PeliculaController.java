package controller;

import model.Pelicula;

import java.time.Duration;

public class PeliculaController {

    Pelicula pelicula = new Pelicula("Avengers","camilo", 120, 2016, 9.0 );

    public String obtenerDuracionFormateada(){
        Duration duration = Duration.ofMinutes(pelicula.getDuracion());
        long horas = duration.toHours();
        long minutos = duration.toMinutesPart();
        System.out.printf("Tiempo de pelicula: %dh %d min\n", horas, minutos);
        return String.format("%02d:%02d", horas, minutos);
    }

    public boolean esClasica(){
        final int anioActual = 2026;
        int tiempoanio = anioActual - pelicula.getAnio();
        if (tiempoanio > 25){
            System.out.println("La pelicula es clasica. tiene mas de 25 años.");
            return true;
        }
        System.out.println("Pelicula no clasica.");
        return false;
    }

    public boolean esRecomendable(){
        if (pelicula.getCalificacion() >= 7){
            System.out.println("La pelicula es recomendable.");
            return true;
        }
        System.out.println("Pelicula no recomendable.");
        return false;
    }

    public void mostrarInfo(){
        System.out.println("Pelicula: " + pelicula.getTitulo());
        System.out.println("Director: " + pelicula.getDirector());
        System.out.printf("Duracion: %d minutos\n", pelicula.getDuracion());
        System.out.println("Anio: " + pelicula.getAnio());
        System.out.println("Calificacion: " + pelicula.getCalificacion());
    }
}
