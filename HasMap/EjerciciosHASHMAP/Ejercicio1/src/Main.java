import controller.ContactoController;
import model.Contacto;

public class Main {
    static void main(String[] args) {

        ContactoController c = new ContactoController();

        c.agregarContacto(new Contacto("camilo", 604141948));
        c.agregarContacto(new Contacto("diana", 605132446));
        c.listarContactos();
        c.contarContactos();
        c.eliminarContacto("diana");
        c.contarContactos();
        c.listarContactos();
    }
}
