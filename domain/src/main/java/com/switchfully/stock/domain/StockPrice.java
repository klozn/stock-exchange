package com.switchfully.stock.domain;

import java.math.BigDecimal;

public class StockPrice {
    private final BigDecimal price;
    private final StockCurrency currency;

    public StockPrice(BigDecimal price, StockCurrency currency) {
        this.price = price;
        this.currency = currency;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public StockCurrency getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "Price: " + price + ", Currency: " + currency.getLabel();
    }
}
