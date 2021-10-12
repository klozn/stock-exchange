package com.switchfully.stock.cli;

import com.switchfully.stock.api.StockExchangeController;

import java.util.logging.Logger;

public class MyCLI {
    public static void main(String[] args) {
        if (args.length == 0) {
            Logger.getAnonymousLogger().severe("Enter an argument as a stock Id.");
        } else if (args.length > 1) {
            Logger.getAnonymousLogger().severe("More than one argument not allowed.");
        } else {
            var controller = new StockExchangeController();
            System.out.println(controller.getStock(args[0]));
        }
    }
}
