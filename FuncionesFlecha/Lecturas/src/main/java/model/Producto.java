package model;

import lombok.Data;
@Data
public class Producto {
    private long id;
    private String title;
    private String description;
    private String category;
    private double price;
    private double discountPercentage;
    private double rating;
    private long stock;
    private String[] tags;
    private String brand;
    private String sku;
    private long weight;
    private Dimensions dimensions;
    private String warrantyInformation;
    private String shippingInformation;
    private String availabilityStatus;
    private String returnPolicy;
    private long minimumOrderQuantity;
    private String[] images;
    private String thumbnail;

    public void mostrarDatos(){
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
    }
}

// Dimensions.java


@Data
class Dimensions {
    private double width;
    private double height;
    private double depth;
}