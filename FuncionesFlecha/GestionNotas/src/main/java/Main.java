import model.Alumno;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class Main {
    /*public static void main(String[] args) {
        Alumno alumno1 = new Alumno("alumno1", "apellido1", "12345", 9);
        Alumno alumno2 = new Alumno("alumno2", "apellido2", "123456");
        Alumno alumno3 = new Alumno("alumno3", "apellido3", "321455");
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);

        //funciones lambda o funciones de flecha
        //iniciamos la lista, recorremos un tipo alumno, flecha y mostramos
        //listaAlumnos.forEach(alumno -> alumno.mostrarDatos());
        //acceso directo a metodos!
        //listaAlumnos.forEach(Alumno::mostrarDatos);
        //listaAlumnos.forEach(Alumno::calcularMedia);

        //bifuntion es una funcion que tiene tres datos
        // tipo parametro 1, tipo parametro2 , tipo retorno
        BiFunction<Integer, Integer, Integer> sumaBi = Integer::sum;
        BiFunction<Alumno, Integer, Integer> notaDuplicada = (a,n) -> a.getNota()*n;
        System.out.println(notaDuplicada.apply(alumno1, 5));
    }*/
}
