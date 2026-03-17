import controller.Ejercicio;
import model.Alumnos;
import model.Productos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ejercicio ejercicio = new Ejercicio();
        //List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        //ejercicio.obtenerCuadrado(5);
        //ejercicio.filtrarNumeros(numeros);
        //ejercicio.calculadoraBasica(10,20);
        //ejercicio.compararString("hola", "hola");
        //ejercicio.imprimirInformacion("Camilo", 25);
        //ejercicio.operacionesEncadenadas(5);
        //ejercicio.gestionProductos(new Productos("telefono", 200.0));
        //ejercicio.gestionProductos(new Productos("tablet", 100.0));
        //List<Integer> numeros1 = List.of(1, 5, 5, 3, 9, 11, 13, 15, 17, 19);
        //List<Integer> numeros2= List.of( 2, 4, 6, 8, 10, 12, 14, 16, 18, 20);
        //ejercicio.funsionListas(numeros1,numeros2);
        ejercicio.gestorCalificaciones(new Alumnos("camilo", 10,8));
        ejercicio.gestorCalificaciones(new Alumnos("belen", 10, 10));
        ejercicio.gestorCalificaciones(new Alumnos("mirian", 9, 6));
        ejercicio.gestorCalificaciones(new Alumnos("david", 7, 8));
        ejercicio.gestorCalificaciones(new Alumnos("yago", 5, 3));
    }
}