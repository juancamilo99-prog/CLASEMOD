package model;

public class Producto {
    private String nombre, codigo;
    private double precio;
    private Categoria categoria;

    public Producto() {
    }

    public Producto(String nombre, String codigo, double precio, Categoria categoria) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.categoria = categoria;
    }

    public Producto(String nombre, String codigo, Categoria categoria) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.categoria = categoria;
        // TODO precio sin definir
        this.precio = -1;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Codigo: " + codigo);
        System.out.println("Precio: " + precio);
        System.out.println("Categoria: " + categoria);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
