package com.switchfully.stock.api;

import com.switchfully.stock.service.StockService;


public class StockExchangeController {
    private StockService service = new StockService();

    public StockDto getStock(String stockId) {
        return new StockDto(service.getStock(stockId));
    }
}
