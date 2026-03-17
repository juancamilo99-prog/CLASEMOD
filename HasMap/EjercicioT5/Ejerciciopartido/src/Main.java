import controller.Registrador;
import model.Equipo;
import model.Partido;

public class Main {
    static void main(String[] args) {

        Equipo equipo1 = new Equipo("Albacete");
        Equipo equipo2 = new Equipo("Real madrid");
        Equipo equipo3 = new Equipo("Barcelona");
        Equipo equipo4 = new Equipo("Atletico madrid");
        Equipo equipo5 = new Equipo("Atletic Bilbao");
        Registrador registrador = new Registrador();
        registrador.registrarPartido(new Partido(equipo1,equipo2,3,3));
        registrador.registrarPartido(new Partido(equipo1,equipo3,0,3));
        registrador.registrarPartido(new Partido(equipo1,equipo4,1,3));
        registrador.registrarPartido(new Partido(equipo1,equipo5,2,3));
        registrador.registrarPartido(new Partido(equipo2,equipo1,2,3));
        registrador.registrarPartido(new Partido(equipo3,equipo1,1,3));
        registrador.registrarPartido(new Partido(equipo4,equipo1,4,3));
        registrador.registrarPartido(new Partido(equipo5,equipo1,0,0));

        registrador.mostrarPartido();
        registrador.mostrarEstadisticas("Barcelona");

    }
}
