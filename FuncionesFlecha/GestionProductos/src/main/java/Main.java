import controller.Gestor;
import model.Categoria;
import model.Producto;

public class Main {
    public static void main(String[] args) {
        Gestor gestor = new Gestor();
        Producto producto1 = new Producto("TV LG", "001LG_TEC", 600.0, Categoria.TECNOLOGICA);
        Producto producto2 = new Producto("Movil LG", "002LG_TEC", 700.0, Categoria.MUEBLE);
        Producto producto3 = new Producto("zapatillas", "003NK_ZAP", 300.0, Categoria.ROPA);
        //producto.mostrarDatos();
        gestor.agregarProducto(producto1);
        gestor.agregarProducto(producto2);
        gestor.agregarProducto(producto3);
        System.out.println(gestor.getEstadisticas().getMax());
        gestor.obtenerDatosAPI();

    }
}
