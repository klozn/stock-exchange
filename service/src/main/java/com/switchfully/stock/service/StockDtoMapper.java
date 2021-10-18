package com.switchfully.stock.service;

import com.switchfully.stock.domain.Stock;

public class StockDtoMapper {

    public static StockDto toDto(Stock stock) {
        return new StockDto().setId(stock.getId())
                .setName(stock.getName())
                .setPrice(stock.getPrice().toString());
    }
}
