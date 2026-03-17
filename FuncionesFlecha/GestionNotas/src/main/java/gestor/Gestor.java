package gestor;

import model.Alumno;

import java.util.*;
import java.util.function.BiPredicate;

public class Gestor {

    private List<Alumno> alumnos;
    private HashMap<String, Alumno> alumnosMap;

    public Gestor() {
        alumnos = new ArrayList<>();
        alumnosMap = new HashMap<>();
    }
    //agregar usuarios
    public void agregarUsuario(Alumno alumno) {
        //solo se agrega si el dni que me dices esta en el mapa
        /*Alumno alumnoAgregado = alumnosMap.put(alumno.getDni(), alumno);
        if (alumnoAgregado != null) {
            System.out.println("Alumno ya existe en el sistema");
        }else {
            System.out.println("Alumno agregado");
        }*/
        //si lo agregas y no esta retorno un nulo
        //si lo agregas y esta retorno el que esta
        //recorro y pregunto en iteracion
        //stream duplica la lista
        boolean esta = alumnos.stream()
                .anyMatch(element -> element.getDni().equals(alumno.getDni()));
        if (esta) {
            System.out.println("Alumno existente");
        }else  {
            System.out.println("agregado de manera correctamente");
            alumnos.add(alumno);
        }
    }

    public void calificarAlumnos(){
        alumnos.forEach(alumno ->{
            if (alumno.getNota() < 0){
                alumno.setNota((int) (Math.random()*10)+1);
            }
        });
    }

    public void mostrarUsuarios(){
        alumnos.forEach(Alumno::mostrarDatos);
    }

    public void calcularMedia(){
        //variable general
        //foreach -> sumar notas
        //divido entre n alumnos
        //obtener la media con funciones lambda
        OptionalDouble media = alumnos.stream().mapToDouble(Alumno::getNota).average();
        System.out.println("Media de alumnos: " + media.getAsDouble());
    }

    public long getNumeroAprobados(){
        //recorro, pregunto >= 5 sumatorio
        return getAlumnosAprobados().size();
    }

    public List<Alumno> getAlumnosAprobados(){
        ArrayList<Alumno> alumnosAprobados = new ArrayList<>();
        return alumnos.stream().filter(item -> item.getNota() > 4).toList();
    }

    public Optional<Alumno> buscarDNI(String dni){
        //si el correo que estas buscando no esta -> null
        //retorno el primero de la lista que haya cumplido el filtro de la lista.
        return alumnos.stream().filter(item -> item.getDni().equals(dni)).findFirst();
    }

    public void ordenadorAlumnos(){
       alumnos = alumnos.stream().sorted(Comparator.comparingInt(Alumno::getNota)).toList();
       alumnos.forEach(Alumno::mostrarDatos);
    }

    public List<Alumno> getAlumnosNota(int nota){
        return alumnos.stream().filter(item -> item.getNota() > 7.5).toList();
    }

    public List<Alumno> getAlumnosNota(BiPredicate<Alumno,Double> predicate, double nota){
        return alumnos.stream()
                                //devuelve un booleano
                .filter(item -> predicate.test(item,nota)).toList();
    }
}
