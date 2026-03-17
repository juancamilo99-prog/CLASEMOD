package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Alumnos {

    private String nombre;
    private double notaTeorica, notaPractica;

    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Nota: "+notaTeorica);
        System.out.println("NotaPractica: "+notaPractica);
    }

    public double notaFinal(){
        return (notaTeorica * 0.6) + (notaPractica * 0.4);
    }
}
