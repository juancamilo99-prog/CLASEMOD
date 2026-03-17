package model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@XmlRootElement(name = "agenda")
@XmlAccessorType(XmlAccessType.FIELD)
public class Agenda {

    @XmlElement(name = "usuario")
    private List<Usuario> lista;

    public Agenda() {
        lista = new ArrayList<>();
    }
}
