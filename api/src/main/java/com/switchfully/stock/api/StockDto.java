package com.switchfully.stock.api;

import com.switchfully.stock.domain.Stock;

public class StockDto {

    private final String name;
    private final String price;

    public StockDto(Stock stock) {
        if (stock != null) {
            this.name = stock.getName();
            this.price = stock.getPrice().toString();
        } else {
            this.name = "";
            this.price = "";
        }
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StockDto{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price='").append(price).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
