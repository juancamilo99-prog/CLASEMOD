package model;

public class Producto {

    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    public Producto() {
    }

    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean hayStock() {
        if (stock>0){
            System.out.println("Stock positivo");
            System.out.println("Cantidad de stock: "+getStock());
            return true;
        }
        System.out.println("producto sin stock");
        return false;
    }

    public boolean Vender(int cantidad) {
        if(cantidad <= stock){
            System.out.println("cantidad suficiente!");
            setStock(getStock()-cantidad);
            return true;

        }
        System.out.println("stock no suficiente");
        return false;
    }

    public void AbastecerStock(int cantidad) {
        setStock(getStock()+cantidad);
        System.out.println("cantidad abastecida: "+cantidad);
        System.out.println("Abastecimiento correcto!");
    }

    public double calcularStock() {
        System.out.println("Cantidad de stock: "+getStock());
        System.out.println("Cantidad de precio: "+getPrecio()*getStock());
        return stock*getPrecio();
    }

    public void mostrarInfo() {
        System.out.println("Codigo producto: "+getCodigo());
        System.out.println("Nombre producto: "+getNombre());
        System.out.println("Precio producto: "+getPrecio());
        System.out.println("Stock producto: "+getStock());
        System.out.println("Precio total: "+calcularStock());

    }
}
