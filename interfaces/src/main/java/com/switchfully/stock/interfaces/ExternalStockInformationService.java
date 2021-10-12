package com.switchfully.stock.interfaces;

import org.apache.commons.lang3.RandomUtils;

import java.math.BigDecimal;

public class ExternalStockInformationService {

    public BigDecimal getPriceInEuroForStock(String stockId) {
        double d = RandomUtils.nextDouble(10, 100);
        return new BigDecimal(d);
    }
}
