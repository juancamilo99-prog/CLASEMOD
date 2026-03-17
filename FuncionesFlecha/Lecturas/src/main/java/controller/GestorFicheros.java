package controller;

import jakarta.xml.bind.*;
import model.*;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class GestorFicheros {

    private String urlBase = "https://dummyjson.com/products/";

    public void exportarXML(){
        Agenda agenda = new Agenda();
        agenda.getLista().add(new Usuario(1,"camilo","borja",new Direccion("Comunidad V", "Valencia", "ValenciaVa"),"2323424",20));
        agenda.getLista().add(new Usuario(2,"jose","martin",new Direccion("madrid V", "madrid", "MadridDB"),"1234",15));
        agenda.getLista().add(new Usuario(3,"nerea","sanchez",new Direccion("Comunidad alicante", "alicant", "alicante"),"43212",25));

        try {
            JAXBContext context = JAXBContext.newInstance(Agenda.class);
            Marshaller marshaller = context.createMarshaller();
            //deja el xml formateado
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(agenda, new File("src/main/java/fichero/usuarios.xml"));
        } catch (JAXBException e) {
            System.err.println("Error en la codificacion del fichero XML");
        }
    }

    public void importarXML(){
        try {
            JAXBContext context = JAXBContext.newInstance(Agenda.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Agenda respuesta = (Agenda) unmarshaller.unmarshal(new File("src/main/java/fichero/usuarios.xml"));
            respuesta.getLista().forEach(Usuario::mostrarDatos);
        } catch (JAXBException e) {
            System.err.println("Error en la traduccion del fichero XML");
        } catch (ClassCastException e) {
            System.out.println("Clases incompatibles");
        }
    }

    public void lecturaJson(){
        ObjectMapper mapper = new ObjectMapper();
        try {
            URL url = new URL(urlBase);
            ProductosRespuesta respuesta = mapper.readValue(url.openStream(), ProductosRespuesta.class);
            respuesta.getProducts().forEach(Producto::mostrarDatos);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
