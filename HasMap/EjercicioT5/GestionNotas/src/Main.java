import model.Alumno;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class Main {
    static void main(String[] args) {
        Alumno alumno1 = new Alumno("camilo", "montero","z1592205n", 9);
        Alumno alumno2 = new Alumno("jose", "perez","z1592205n",4);
        Alumno alumno3 = new Alumno("juan", "mosquera","z1592205n",5);

        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        /*for (Alumno alumno : alumnos) {
            alumno.mostrarDatos();
        }*/

        //funciones lambda o funciones de flecha

        //funcion que tiene como parametro otra funcion
            //por cada iteracion yo tengo un objeto y ejecuto un cuerpo
        //alumnos.forEach(alumno -> alumno.mostrarDatos()); funcion lambda
        //alumnos.forEach(Alumno::mostrarDatos); //aceeso directo a metodos
        //alumnos.forEach(Alumno::calcularMedio);

        //Bifuction
        //una funcion que tiene tres datos -> tipo param1 tipo param2 tipo retorno
        //BiFunction<Integer, Integer, Integer>
        /*public int sumar(int p1, int p2){
        return p1 + p2;
        }*/
        BiFunction<Integer,Integer,Integer> sumaBi = Integer::sum;
        BiFunction<Alumno,Integer,Integer> notaDuplicada = (a,n)-> a.getNota()*n;
        System.out.println(sumaBi.apply(1,4));
        System.out.println(notaDuplicada.apply(alumno1,5));

        //calcular la nota media -> recorrer
        int notaTotal = 0;
        //tu tienes los alumnos, los recorres y convierte cada alumno en una sola nota, recorres cada nota
        // y lo imprimes de forma directa.
        alumnos.stream().map(Alumno::getNota).forEach(System.out::println);
    }
}
