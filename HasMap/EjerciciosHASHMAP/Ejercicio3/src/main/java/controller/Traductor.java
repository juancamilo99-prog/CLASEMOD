package controller;

import model.Diccionario;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Traductor {

    Scanner sc = new Scanner(System.in);
    //creamos el hashmap
    private HashMap<String, String> listaDiccionario;
    public Traductor() {
        listaDiccionario = new HashMap<>();
    }

    public void agregarTraduccion(Diccionario diccionario) {
        //preguntamos si la clave existe.
        if (listaDiccionario.containsKey(diccionario.getEspanol())){
            //si existe, arrojamos un mensaje de que existe
            System.out.println("Ya existe la traduccion");
            System.out.println("lo vas a actualizar");
            //borramos
            listaDiccionario.remove(diccionario.getEspanol());
            // y actualizamos
            listaDiccionario.put(diccionario.getEspanol(), diccionario.getIngles());
        } else {
            //si no existe, se agrega.
            listaDiccionario.put(diccionario.getEspanol(), diccionario.getIngles());
        }
    }

    public String traducir(String palabra){
        //
        if (listaDiccionario.containsKey(palabra)){
            System.out.println("palabra traducida correctamente");
            return listaDiccionario.get(palabra);
        }else {
            System.out.println("La traduccion no existe");
        }
        return palabra;
    }

    public void agregarVariasTraducciones(String[][] traducciones){
        for (int i = 0; i < traducciones.length; i++) {
            System.out.printf("Agregar Traduccion [%d] : ",i);
            String palabra = traducciones[i][0];
            String traduccion = traducciones[i][1];
            listaDiccionario.put(palabra, traduccion);
            System.out.printf("Añadido: %s - %s\n", palabra, traduccion);
        }
    }

    public void traducirFrase(String frase){
        String[] palabras = frase.split(" ");
        String palabra;
        System.out.printf("la frase: %s\n", frase);
        System.out.print("la traduccion: ");
        for (int i = 0; i < palabras.length; i++) {
            palabra = palabras[i];
            if (listaDiccionario.containsKey(palabra)){
                System.out.print(listaDiccionario.get(palabra) + " ");
            }else  {
                System.out.println("La traduccion no existe");
            }
        }
        System.out.println();
    }

    public void listarDiccionario(){
        System.out.println("Palabras | Traduccion");
        for (Map.Entry<String,String> entry : listaDiccionario.entrySet()){
            System.out.printf(" %s : %s\n", entry.getKey(), entry.getValue());
        }
    }

    public int tamanioDiccionario(){
        System.out.printf("Diccionario cargado con %d palabras", listaDiccionario.size());
        return listaDiccionario.size();
    }


}
