package com.switchfully.stock.domain;

import com.google.common.collect.ImmutableMap;

public class StockRepository {
    private final ImmutableMap<String, Stock> stockMap;

    public StockRepository() {
        this.stockMap = new ImmutableMap.Builder<String, Stock>()
                .put("1", new Stock("1", "Coca-Cola"))
                .put("2", new Stock("2", "Pepsi"))
                .put("3", new Stock("3", "River"))
                .put("4", new Stock("4", "Boni"))
                .put("5", new Stock("5", "365")).build();
    }

    public Stock getStockInformation(String stockId) {
        if (!stockMap.containsKey(stockId)) {
            throw new IllegalArgumentException("No such stockId");
        }
        return stockMap.get(stockId);
    }
}
