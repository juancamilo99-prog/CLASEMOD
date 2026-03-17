package controller;

import model.Producto;

import java.time.Period;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Almacen {

    private HashMap<String, Producto> listaProductos;
    public Almacen() {
        listaProductos = new HashMap<>();
    }

    public void agregarProduccto(Producto producto) {
        if (existeProducto(producto.getCodigo())) {
            int cantidadActual = listaProductos.get(producto.getCodigo()).getCantidad();
            listaProductos.get(producto.getCodigo()).setCantidad(cantidadActual+1);

        }else {
            listaProductos.put(producto.getCodigo(), producto);
            System.out.println("Producto agregado");
        }
    }

    public Integer consultarStock(String codigo) {
        if (existeProducto(codigo)) {
            System.out.println("Producto consultado");
            System.out.println("Cantidad del producto: "+listaProductos.get(codigo).getCantidad());
            return listaProductos.get(codigo).getCantidad();
        }
        return null;
    }

    public void listarInventario(){
        Set<String> keys = listaProductos.keySet();
        for (String key : keys) {
            Producto producto = listaProductos.get(key);
            producto.mostrarInfo();
        }

    }

    public boolean existeProducto(String codigo) {
        if (listaProductos.containsKey(codigo)) {
            System.out.println("producto ya existe!");
            return true;
        }
        return false;
    }
}
