import controller.GestorFicheros;

public class Main {
    public static void main(String[] args) {
        GestorFicheros gf = new GestorFicheros();
        //gf.exportarXML();
        //gf.importarXML();
        gf.lecturaJson();
    }
}
