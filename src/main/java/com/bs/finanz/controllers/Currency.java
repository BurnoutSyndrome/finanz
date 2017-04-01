package com.bs.finanz.controllers;

import com.bs.finanz.data.models.CurrencyItem;
import com.bs.finanz.data.viewmodels.CurrencyViewModel;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
@RequestMapping(value = "/Currency", method = RequestMethod.GET)
public class Currency {
    @Value("${url.currency}")
    private String currencyUrl;

    private final DozerBeanMapper mapper;

    @Autowired
    public Currency(DozerBeanMapper mapper) {
        this.mapper = mapper;
    }

    @RequestMapping
    public CurrencyViewModel[] home() {
        RestTemplate restTemplate = new RestTemplate();
        CurrencyItem[] items = restTemplate.getForObject(currencyUrl, CurrencyItem[].class);

        return Arrays.stream(items).map(item -> mapper.map(item, CurrencyViewModel.class))
                .toArray(CurrencyViewModel[]::new);
    }
}
