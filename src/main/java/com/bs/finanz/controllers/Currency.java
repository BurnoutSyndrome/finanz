package com.bs.finanz.controllers;

import com.bs.finanz.models.CurrencyItem;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Currency {
    @Value("${url.currency}")
    private String currencyUrl;

    @RequestMapping("/Currency")
    public CurrencyItem[] home() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(currencyUrl, CurrencyItem[].class);
    }
}
