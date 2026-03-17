package controller;

import model.Alumnos;
import model.Productos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Stream;

public class Ejercicio {
    private List<Productos> productos;
    private List<Alumnos> alumnos;

    public Ejercicio() {
        productos = new ArrayList<>();
        alumnos = new ArrayList<>();
    }

    public void obtenerCuadrado(double numero){
        /*Ejercicio 1 - Lambda Básica: Operación Simple**
     Crea una función lambda que reciba un número entero y
     devuelva su cuadrado.
     Pruébala con los números del 1 al 5.*/
        Function<Double, Double> function = x -> Math.pow(x, 2);
        double resultado = function.apply(numero);
        System.out.println("total cuadrado: "+resultado);
    }

    public void filtrarNumeros(List<Integer> numeros){
        /*Ejercicio 2 - Predicate: Filtrado de Números**

         Utiliza un Predicate para crear una función lambda que
         determine si un número es par. Aplícala a una lista de
         números del 1 al 20 y muestra solo los pares.*/
        Predicate<Integer> filtro = numero -> numero % 2 == 0;
        numeros.stream().filter(filtro).forEach(System.out::println);
    }

    public void calculadoraBasica(double numero1, double numero2){
        /*Ejercicio 3 - BiFunction: Calculadora Básica**

         Crea una BiFunction que reciba dos números enteros y
         devuelva su suma. Después, crea otras tres
         BiFunctions para resta, multiplicación y división.*/
        BiFunction<Double, Double, Double> sumaBifuction = Double::sum;
        BiFunction<Double, Double, Double> restaBifuction = Double::min;
        BiFunction<Double, Double, Double> multiplicacionBofuction = (a,b) -> a*b;
        BiFunction<Double, Double, Double> divisionBifuction = (a,b) -> a/b;

        double resultadosuma = sumaBifuction.apply(numero1, numero2);
        double resultadoresta = restaBifuction.apply(numero1, numero2);
        double resultadormultiplicacion = multiplicacionBofuction.apply(numero1, numero2);
        double resultadivision = divisionBifuction.apply(numero1, numero2);
        System.out.println("suma bifuction: "+resultadosuma);
        System.out.println("resta bifuction: "+resultadoresta);
        System.out.println("multiplicacion bifuction: "+resultadormultiplicacion);
        System.out.println("division bifuction: "+resultadivision);
    }

    public void compararString(String palabra1, String palabra2){
        /*Ejercicio 4 - BiPredicate:
        Comparación de Strings**

         Implementa un BiPredicate que reciba dos Strings y
         determine si tienen la misma longitud. Pruébalo con varios pares de palabras.*/
        BiPredicate<String, String> comparaPalabra = (a, b) -> a.length() == b.length();
        boolean resultado =  comparaPalabra.test(palabra1, palabra2);
        System.out.println("resultado: "+resultado);

    }

    public void imprimirInformacion(String nombre, Integer edad){
        /*Ejercicio 5 - Consumer y BiConsumer: Impresión de Datos**

         Crea un BiConsumer que reciba un nombre (String) y una edad (Integer)
         e imprima un mensaje formateado como "Nombre: [nombre], Edad: [edad]".
         Úsalo para imprimir información de varios estudiantes.*/

        BiConsumer<String, Integer> imprimirInformacion = (a,b) -> System.out.printf("NOMBRE: %s , EDAD: %d\n", a, b);
        imprimirInformacion.accept(nombre, edad);
    }

    public void operacionesEncadenadas(Integer numero){
        /*Ejercicio 6 - Composición de Funciones: Operaciones Encadenadas**

         Utiliza Function y el metodo 'andThen()' para crear una
         cadena de operaciones: toma un número,
         súmale 10, multiplícalo por 2, y conviértelo a String.
         Aplícalo a una lista de números.*/
        Function<Integer, Integer> sumarNumero = x -> x + 10;
        Function<Integer, Integer> multiplicarNumero = x -> x * 2;
        Function<Integer, String> conversionastring =  x -> String.valueOf(x);

        Function<Integer, String> integrarFuncioness = sumarNumero.andThen(multiplicarNumero).andThen(conversionastring);
        String resultado = integrarFuncioness.apply(numero);
        System.out.println("resultado: "+resultado);
    }

    public void gestionProductos(Productos producto){
        /*Crea una clase Producto con nombre y precio.
        Implementa una BiFunction que reciba dos Productos
        y devuelva el producto con mayor precio.
        Pruébala con una lista de al menos 5 productos.*/
        productos.add(producto);
        BiFunction<Productos, Productos, Productos> gestionProductos = (p1, p2) -> p1.getPrecio() > p2.getPrecio() ? p1 : p2;
        Productos resultado = productos.get(0);
        for (int i = 1; i < productos.size(); i++) {
            resultado = gestionProductos.apply(resultado, productos.get(i));
        }
        resultado.mostrarDatos();
    }

    public void funsionListas(List<Integer> num1, List<Integer> num2){
        /*mplementa una BiFunction que reciba dos listas de enteros y
        devuelva una nueva lista con todos los elementos de
        ambas listas, pero sin duplicados y ordenada de menor a mayor.*/
        BiFunction<List<Integer>, List<Integer>, List<Integer>> listasCombinadas = (lista1, lista2) -> {
            return Stream.concat(lista1.stream(), lista2.stream()) // -> concat -> sirve para unir dos stream
                    .distinct() // -> elimina eleemntos duplicados de un stream
                    .sorted() // -> ordenada los elementos de un stream
                    .toList(); // -> devuelve una lista.
        };
        List<Integer> resultado = listasCombinadas.apply(num1, num2);
        System.out.println("resultado: "+resultado);

    }

    public void gestorCalificaciones(Alumnos alumnosDatos){
        /*Crea un sistema de gestión de calificaciones que utilice:
            - BiFunction para calcular la nota final (teoría 60%, práctica 40%)
            - BiPredicate para verificar si un alumno ha aprobado (nota >= 5)
            - Function para convertir notas numéricas a letras (A, B, C, D, F)
            - BiConsumer para imprimir el informe completo del alumno
            - Predicate para filtrar alumnos aprobados/suspensos
            Implementa una clase Alumno con nombre, nota de teoría y nota de práctica.
            Crea una lista de al menos 8 alumnos y aplica todas las
            funciones lambda para generar un informe completo.*/
        BiFunction<Double, Double, Double> notaFinal = (teoria,practica) -> (teoria*60/100)+(practica*40/100);
        double resultadoFinal = notaFinal.apply(alumnosDatos.getNotaTeorica(), alumnosDatos.getNotaPractica());
        BiPredicate<Double, Double> alumnoAprobado = (nota, minimo) -> nota >= minimo;
        boolean resultadoAprobado = alumnoAprobado.test(resultadoFinal, 5.0);
        Function<Double, String> convertirNota = nota -> {
            if (nota >= 9) return  "A";
            else if (nota >= 7) return "B";
            else if (nota >= 5) return "D";
            else if (nota >= 3) return "E";
            else return "F";
        };
        String resultado = convertirNota.apply(resultadoFinal);
        BiConsumer<Double, Boolean> imprimirInfo = (notaF, Aprobado) -> System.out.printf("Nota final: %.1f - Esta Aprobado?: %b\n", notaF, Aprobado);
        imprimirInfo.accept(resultadoFinal, resultadoAprobado);
        Predicate<Alumnos> filtroAprobados = nota -> nota.notaFinal() >= 5;
        alumnos.stream().filter(filtroAprobados).forEach(Alumnos::mostrarDatos);
        System.out.println("Aprobado: "+resultadoAprobado);
        System.out.println("Nota en string: "+resultado);


    }
}
