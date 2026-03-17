import gestor.Gestor;
import model.Alumno;

import javax.swing.plaf.SliderUI;
import java.util.ArrayList;
import java.util.HashMap;

public class MainPruebas {
    public static void main(String[] args) {
        Gestor gestor = new Gestor();
        gestor.agregarUsuario(new Alumno("alumno1", "apellido1", "1234A", 8));
        gestor.agregarUsuario(new Alumno("alumno2", "apellido2", "1234B",2));
        gestor.agregarUsuario(new Alumno("alumno3", "apellido3", "1234C",3));
        gestor.agregarUsuario(new Alumno("alumno4", "apellido4", "1234D",10));
        gestor.agregarUsuario(new Alumno("alumno5", "apellido5", "1234E",2));
        //gestor.calificarAlumnos();
        //gestor.getAlumnosAprobados().forEach(Alumno::mostrarDatos);
        //gestor.mostrarUsuarios();
        //gestor.calcularMedia();
        //gestor.buscarDNI("1234A").ifPresent(Alumno::mostrarDatos);
        //String dni = "1234AB";
        //gestor.buscarDNI(dni).ifPresentOrElse(Alumno::mostrarDatos , () -> gestor.agregarUsuario(new Alumno("nuevo", "nuevo", dni)));
        //gestor.buscarDNI(dni).ifPresentOrElse(Alumno::mostrarDatos , () -> gestor.agregarUsuario(new Alumno("nuevo", "nuevo", dni)));
        gestor.calificarAlumnos();
        gestor.ordenadorAlumnos();
        gestor.getAlumnosNota((e,n) -> e.getNota() > n,5);
    }
}
