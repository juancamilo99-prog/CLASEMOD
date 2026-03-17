import controller.Almacen;
import model.Producto;

public class Main {
    static void main(String[] args) {
        Almacen almacen = new Almacen();

        almacen.agregarProduccto(new Producto("A1", 5 , 25));
        almacen.agregarProduccto(new Producto("A1", 5 , 25));
        almacen.agregarProduccto(new Producto("A2", 10 , 35));
        almacen.agregarProduccto(new Producto("A3", 1 , 50));

        almacen.consultarStock("A2");
    }
}
