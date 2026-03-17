package model;

public enum Categoria {

    ALIMENTO,
    MUEBLE("Este producto es un mueble para decorar"),
    ROPA,
    TECNOLOGICA("producto con capacidades tecnologicas");

    private String descripcion;

    Categoria(String descripcion) {
        this.descripcion = descripcion;
    }

    Categoria() {

    }

    public String getDescripcion() {
        return descripcion;
    }
}
