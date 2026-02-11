package model;

public class Libro {

    private String titulo;
    private String autor;
    private int numPaginas;
    private double precio;

    public Libro() {
    }

    public Libro(String titulo, String autor, int numPaginas, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrarInfo(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("NumPaginas: "+numPaginas);
        System.out.printf("Precio: %.2f\n",precio);
        esLibroLargo();
        aplicarDescuento(10);
    }

    public boolean esLibroLargo(){
        boolean eslibr= false;
        if (numPaginas > 300){
            eslibr = true;
            System.out.println("Es un libro largo? "+eslibr);
            return true;
        }
        System.out.println("Es un libro largo? "+eslibr);
        return false;
    }

    public void aplicarDescuento(double porcentaje){
        double descuentoTotal = (getPrecio()*10)/100;
        double precioTotal = getPrecio()-descuentoTotal;
        System.out.println("Nuevo precio: "+precioTotal);
    }
}
