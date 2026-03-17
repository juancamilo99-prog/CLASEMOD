package model;

public class Producto {

    private String codigo;
    private int cantidad;
    private double precio;

    public Producto() {
    }

    public Producto(String codigo, int cantidad, double precio) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public void mostrarInfo(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio: " + precio);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
