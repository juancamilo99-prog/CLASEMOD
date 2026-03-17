package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Alumno {

    private String nombre, apellido, dni;
    private int nota;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String dni, int nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nota = nota;
    }

    public Alumno(String nombre, String apellido, String dni) {
        this(nombre, apellido, dni, -1);
        nota = -1;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("DNI: " + this.dni);
        System.out.println("Nota: " + this.nota);
    }

    public void calcularMedia(){
        double media = ((double) nota*3+nota*4)/2;
        System.out.println("Media: "+media);
    }

    public int sumar(int p1, int p2){
        return p1+p2;
    }
}
