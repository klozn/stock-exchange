package com.switchfully.stock.service;

public class StockDto {

    private String id;
    private String name;
    private String price;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public StockDto setId(String id) {
        this.id = id;
        return this;
    }

    public StockDto setName(String name) {
        this.name = name;
        return this;
    }

    public StockDto setPrice(String price) {
        this.price = price;
        return this;
    }
}
