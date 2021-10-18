package com.switchfully.stock.service;

import com.switchfully.stock.domain.Stock;
import com.switchfully.stock.domain.StockCurrency;
import com.switchfully.stock.domain.StockPrice;
import com.switchfully.stock.domain.StockRepository;
import com.switchfully.stock.interfaces.ExternalStockInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService {

    private final StockRepository repository;

    @Autowired
    public StockService(StockRepository repository) {
        this.repository = repository;
    }

    public StockDto getStockById(String stockId) {
        Stock stock = repository.getStockById(stockId);
        if (stock == null) {
            throw new IllegalArgumentException("No stock in memory with id: " + stockId);
        }
        stock.setPrice(new StockPrice(ExternalStockInformationService.getPriceInEuroForStock(stockId), StockCurrency.EUR));
        return StockDtoMapper.toDto(stock);
    }
}
