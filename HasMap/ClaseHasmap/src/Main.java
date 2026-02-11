import controller.Agenda;
import model.Persona;

public class Main {

    public static void main(String[] args) {
        Agenda ag = new Agenda();
        ag.agregarPersona(new Persona("camilo", "montero", "1234"));
        ag.agregarPersona(new Persona("luz", "montero", "12345"));
        ag.mostrarPersonas();
    }
}
