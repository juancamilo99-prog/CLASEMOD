package controller;


import model.Estudiante;

public class EstudianteController {

    Estudiante estudiante = new Estudiante("camilo", 20,8,9.5,7);

    public double calcularPromedio(){
        double promedio = (estudiante.getNotaIngles()+estudiante.getNotaMatematicas()+ estudiante.getNotaProgramacion())/3;
        System.out.printf("Promedio: %.2f\n",promedio);
        estasAprobado(promedio);
        obtenerCalificacion(promedio);

        return promedio;
    }

    public boolean estasAprobado(double promedio){
        if (promedio > 5){
            System.out.println("Estas aprobado!");
            return true;
        }
        System.out.println("No has aprobado!");
        return false;
    }

    public String obtenerCalificacion(double promedio){
        if (promedio < 5){
            System.out.println("Promedio insuficiente!");
        }
        if (promedio >= 5 &&  promedio <= 5.9){
            System.out.println("Promedio suficiente!");
        }
        if (promedio >= 6 &&  promedio <= 6.9){
            System.out.println("Promedio bien!");
        }
        if (promedio >= 7 &&  promedio <= 8.9){
            System.out.println("Promedio notable!");
        }
        if (promedio >= 9 &&  promedio <= 10){
            System.out.println("Promedio sobresaliente!");
        }

        return "";
    }

    public void mostrarInforme(){
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Nota Matematicas: " + estudiante.getNotaMatematicas());
        System.out.println("Nota Programacion: " + estudiante.getNotaProgramacion());
        System.out.println("Nota Ingles: " + estudiante.getNotaIngles());
        calcularPromedio();
    }
}
