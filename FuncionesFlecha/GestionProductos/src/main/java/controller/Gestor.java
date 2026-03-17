package controller;

import model.Producto;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;
import java.util.function.BiPredicate;

public class Gestor {
    private List<Producto> productos;
    public Gestor() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        //recorrer - preguntar - bool
        /*boolean existe = productos.stream().anyMatch(item -> item.getCodigo()
                .equalsIgnoreCase(producto.getCodigo())); //retorna un bool
        if (existe) {
            System.out.println("El producto ya existe");;
        }else  {
            productos.add(producto);
        }*/

        if (buscarPorCodigo(producto.getCodigo()).isPresent()) {
            System.out.println("El producto ya existe");
        }else {
            productos.add(producto);
            System.out.println("producto agregado");
        }
    }

    public void asignarPrecios(){
        //recorro - pregunto - cambio
        productos.stream()
                .filter(item -> item.getPrecio() < 0)
                .forEach(item -> item.setPrecio((Math.random() * 100)+1));
    }

    public void mostrarDatos(){
        productos.forEach(Producto::mostrarDatos);
    }

    public double calcularPrecioMedio(){
        //return (productos.stream().mapToDouble(Producto::getPrecio).sum()) / productos.size();
        return  productos.stream().mapToDouble(Producto::getPrecio)
                .average()
                .orElse(0.0);
    }

    public long getNumerosProductosCaros(int limite){
        //recorro la lista de uno en uno, quiero la copia indiviaul de cada uno
        //hago un filtrado cada producto si su item.precio es > al limite, cuentalos.
        return productos.stream().filter(item -> item.getPrecio() > limite).count();
    }

    public List<Producto> getProductosCaros(double limite) {
        return productos.stream().filter(item -> item.getPrecio() >= limite).toList();
    }

    public Optional<Producto> buscarPorCodigo(String codigo) {
        return productos.stream().filter(item -> item.getCodigo().equalsIgnoreCase(codigo)).findFirst();
    }

    public void ordenarDescendente(){
        productos.sort(Comparator.comparingDouble(Producto::getPrecio).reversed());
    }

    public List<Producto> getProductosPorCondicion(BiPredicate<Producto, Double> condicion, double parametro) {
        return productos.stream().filter(item -> condicion.test(item, parametro))
                .toList();
    }

    public DoubleSummaryStatistics getEstadisticas(){
        return productos.stream()
                .mapToDouble(Producto::getPrecio)
                .summaryStatistics();
    }

    public void obtenerDatosAPI(){
        try {
            String urlProductos = "https://dummyjson.com/products"; //@body
            //abre el navegador
            HttpClient client = HttpClient.newHttpClient();
            //crea la peticion
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlProductos)).GET().build();
            //lanza la peticion y espera una respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String body = response.body();
            JSONObject json = new JSONObject(body);

            System.out.println(response.statusCode());
        } catch (IOException e) {
            System.err.println("Error de I/O");
        } catch (InterruptedException e) {
            System.err.println("Error en la conexion");
        }
    }
}
