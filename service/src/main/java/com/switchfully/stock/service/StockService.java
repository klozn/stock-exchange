package com.switchfully.stock.service;

import com.switchfully.stock.domain.Stock;
import com.switchfully.stock.domain.StockCurrency;
import com.switchfully.stock.domain.StockPrice;
import com.switchfully.stock.domain.StockRepository;
import com.switchfully.stock.interfaces.ExternalStockInformationService;

import java.util.logging.Logger;

public class StockService {

    private final StockRepository repository = new StockRepository();
    private final ExternalStockInformationService esis = new ExternalStockInformationService();

    public Stock getStock(String stockId) {
        try {
            Stock stock = repository.getStockInformation(stockId);
            stock.setPrice(new StockPrice(esis.getPriceInEuroForStock(stockId), StockCurrency.EUR));
            return stock;
        } catch (IllegalArgumentException e) {
            Logger.getAnonymousLogger().warning(e.getMessage());
            return null;
        }
    }
}
