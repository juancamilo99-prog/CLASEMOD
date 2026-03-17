import controller.PeliculaController;
import model.Pelicula;

public class Main {

    static void main(String[] args) {

        PeliculaController peliculaController = new PeliculaController();

        peliculaController.obtenerDuracionFormateada();
        peliculaController.esClasica();
        peliculaController.esRecomendable();
        peliculaController.mostrarInfo();
    }
}
