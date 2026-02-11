package controller;

import model.Persona;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Agenda {

    private HashMap<String, Persona> listaPersonas;
    public Agenda(){
        listaPersonas = new HashMap<>();
    }

    public void agregarPersona(Persona persona){
        // listaPersonas.put(persona.getDni(), persona); -> retorna la persona agregada
        //busar en lel hasmap si existe
        if (listaPersonas.containsKey(persona.getDni())){
            System.out.println("El dni ya esta asociado, no puedes agregar");
        } else  {
            listaPersonas.put(persona.getDni(), persona); //agregar persona
            System.out.println("agregado correctamente");
        }
    }

    public void eliminarPersona(String dni){
        if (listaPersonas.containsKey(dni)){
            listaPersonas.remove(dni);
        } else  {
            System.out.println("El dni no existe");
        }
    }

    public Persona obtenerPersona(String dni){
        //si el dni esta en una lista -> persona
        // si el dni no esta en la lista -> null
        return listaPersonas.get(dni);
    }

    public void mostrarPersonas(){
        //sacas las keys -> recorrees -> cada key -> get -> valor
        Set<String> keys = listaPersonas.keySet();
        for (String key : keys){
            Persona persona = listaPersonas.get(key);
            persona.mostrar();
        }

        //sacas los valores -> recorres

        Collection<Persona> values = listaPersonas.values();
        for (Persona persona : values){
            persona.mostrar();
        }
    }

    public void modificarPersona(String dni,Persona persona){
        listaPersonas.replace(dni,persona);
    }
}
