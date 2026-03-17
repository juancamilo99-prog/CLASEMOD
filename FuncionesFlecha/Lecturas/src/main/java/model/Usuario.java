package model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class Usuario {

    @XmlAttribute
    private int id;
    private String nombre;
    private String apellido;
    private Direccion direccion;
    @XmlAttribute
    private String dni;
    @XmlAttribute
    private int edad;

    public Usuario(String nombre, String apellido, Direccion direccion, String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.dni = dni;
        this.edad = edad;
    }

    public void mostrarDatos(){
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Direccion: " + direccion.getLocalidad());
        System.out.println("Dni: " + dni);
        System.out.println("Edad: " + edad);
    }
}
