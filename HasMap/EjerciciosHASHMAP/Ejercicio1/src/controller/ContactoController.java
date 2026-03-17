package controller;

import model.Contacto;

import java.util.HashMap;
import java.util.Set;

public class ContactoController {

    private HashMap<String, Contacto> contactos;
    private Contacto contacto;

    public ContactoController() {
        contactos = new HashMap<>();
        contacto = new Contacto();
    }

    public void agregarContacto(Contacto contacto){
        //preguntamos con containsKey que es el nombre, este o exista.
        if (existeContacto(contacto.getNombre())){
            System.out.println("El contacto ya existe");
        }else {
            contactos.put(contacto.getNombre(), contacto); //se agrega la persona
            System.out.println("Contacto agregado");
        }
    }

    public Contacto buscarContacto(String nombre){
        if (!existeContacto(nombre)){
            System.out.println("contacto ya existe");
        }else {
            System.out.println("El contacto: "+contactos.get(nombre).getNombre());
            System.out.println("El telefno es: "+contactos.get(nombre).getTelefono());
        }
        return contactos.get(nombre);
    }

    public boolean eliminarContacto(String nombre){
        //buscamos que este nombre este dentro de la lista
        if (contactos.containsKey(nombre)){
            //si esta, lo borramos.
            contactos.remove(nombre);
            return true;
        }else  {
            System.out.println("El contacto no existe");
        }
        return false;
    }

    public void listarContactos(){
        Set<String> keys = contactos.keySet();
        for (String key : keys){
            Contacto contacto = contactos.get(key);
            contacto.mostrarDatos();
        }
    }

    public int contarContactos(){
        System.out.println("Contactos listado: "+contactos.size());
        return contactos.size();
    }

    public boolean existeContacto(String nombre){
        if (contactos.containsKey(nombre)){
            return true;
        }
        return false;
    }
}
