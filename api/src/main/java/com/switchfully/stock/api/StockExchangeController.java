package com.switchfully.stock.api;

import com.switchfully.stock.service.StockDto;
import com.switchfully.stock.service.StockService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@Controller
@ResponseBody
@RequestMapping("/stocks")
public class StockExchangeController {

    private final StockService service;
    private final Logger logger = LoggerFactory.getLogger(StockExchangeController.class);

    @Autowired
    public StockExchangeController(StockService service) {
        this.service = service;
    }

    @GetMapping(path = "/{stockId}")
    public StockDto getStock(@PathVariable String stockId) {
        try {
            logger.info("Querying stock with id:" + stockId);
            return service.getStockById(stockId);
        } catch (IllegalArgumentException e) {
            logger.warn("Stock id:" + stockId + "does not exist in database");
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
    }
}
