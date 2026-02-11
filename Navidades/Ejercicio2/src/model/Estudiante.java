package model;

public class Estudiante {

    private String nombre;
    private int edad;
    private double notaMatematicas;
    private double notaProgramacion;
    private double notaIngles;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, double notaMatematicas, double notaProgramacion, double notaIngles) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMatematicas = notaMatematicas;
        this.notaProgramacion = notaProgramacion;
        this.notaIngles = notaIngles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaMatematicas() {
        return notaMatematicas;
    }

    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public double getNotaProgramacion() {
        return notaProgramacion;
    }

    public void setNotaProgramacion(double notaProgramacion) {
        this.notaProgramacion = notaProgramacion;
    }

    public double getNotaIngles() {
        return notaIngles;
    }

    public void setNotaIngles(double notaIngles) {
        this.notaIngles = notaIngles;
    }
}
