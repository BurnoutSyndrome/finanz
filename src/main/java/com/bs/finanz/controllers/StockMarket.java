package com.bs.finanz.controllers;

import com.bs.finanz.models.StockMarketItem;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class StockMarket {
    @Value("${url.stockmarket}")
    private String stockMarketUrl;

    @RequestMapping("/StockMarket")
    public StockMarketItem[] home() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(stockMarketUrl, StockMarketItem[].class);
    }
}
