package controller;

import model.Partido;

import java.util.ArrayList;

public class Registrador {

    private ArrayList<Partido> listaPartidos;

    public Registrador() {
        this.listaPartidos = new ArrayList<>();
    }

    public void registrarPartido(Partido partido){
        this.listaPartidos.add(partido);

    }

    public void mostrarPartido(){
        for (Partido partido : listaPartidos){
            partido.mostrarDatos();
        }
    }

    public void mostrarEstadisticas(String nombre){
        //bscar por nombre de equipo y sacar sus estadisticas
        //buusco en el array de partidos
        for (Partido partido : listaPartidos){
            if (partido.getEquipoLocal().getNombre().equals(nombre)){
                partido.getEquipoLocal().mostrarEstadisticas();
                break;
            }else if (partido.getEquipoVisitante().getNombre().equals(nombre)){
                partido.getEquipoVisitante().mostrarEstadisticas();
                break;
            }
            System.out.println("Equipo no encontrado en la relacion de partidos.");
        }
    }

    public ArrayList<Partido> getListaPartidos() {
        return listaPartidos;
    }

    public void setListaPartidos(ArrayList<Partido> listaPartidos) {
        this.listaPartidos = listaPartidos;
    }
}
