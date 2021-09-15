package com.brian.ecommerce.Model;

public class Product {
    private double regularPrice;
    private String name;
    private String description;
    private double shipping;

    public Product(double regularPrice, String name, String description, double shipping) {
        this.regularPrice = regularPrice;
        this.name = name;
        this.description = description;
        this.shipping = shipping;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getShipping() {
        return shipping;
    }

    public void setShipping(double shipping) {
        this.shipping = shipping;
    }
}
