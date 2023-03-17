package com.example.ss11_mvc.bean;

public class Product {
    // id, tên sản phẩm, giá sản phẩm, mô tả của sản phẩm, nhà sản xuất.
    private String id;
    private String nameProduct;
    private double price;
    private String describe;
    private String producer;

    public Product(String id, String nameProduct, double price, String describe, String producer) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.describe = describe;
        this.producer = producer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
