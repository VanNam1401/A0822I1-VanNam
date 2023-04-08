package com.example.end_exam.model;

public class Product {
    private int id;
    private String name;
    private int price;
    private int quantity;
    private String color;
    private String describe;
    private int id_product;
    private String name_product;

    public Product() {
    }

    public Product(String name, int price, int quantity, String color, String describe, int id_product) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.describe = describe;
        this.id_product = id_product;
    }

    public Product(int id, String name, int price, int quantity, String color, String describe, int id_product) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.describe = describe;
        this.id_product = id_product;
    }

    public Product(int id, String name, int price, int quantity, String color, String describe, int id_product, String name_product) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.describe = describe;
        this.id_product = id_product;
        this.name_product = name_product;
    }

    public Product(String name, int price, int quantity, String color, String describe, int id_product, String name_product) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.describe = describe;
        this.id_product = id_product;
        this.name_product = name_product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }
}
