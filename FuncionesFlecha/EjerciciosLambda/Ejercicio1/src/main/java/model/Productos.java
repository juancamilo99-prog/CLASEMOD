package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Productos {
    private String nombre;
    private Double precio;

    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: "+precio);
    }
}
