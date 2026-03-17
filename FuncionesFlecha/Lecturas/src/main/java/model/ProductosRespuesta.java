package model;


import lombok.Data;

import java.util.List;

@Data
public class ProductosRespuesta {
    private List<Producto> products;
    private long total;
    private long skip;
    private long limit;
}
