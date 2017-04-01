package com.bs.finanz.controllers;

import com.bs.finanz.data.models.StockMarketDetailItem;
import com.bs.finanz.data.models.StockMarketItem;
import com.bs.finanz.data.models.StockMarketXU100Item;
import com.bs.finanz.data.viewmodels.StockMarketDetailViewModel;
import com.bs.finanz.data.viewmodels.StockMarketViewModel;
import com.bs.finanz.data.viewmodels.StockMarketXU100ViewModel;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
@RequestMapping("/StockMarket")
public class StockMarket {
    @Value("${url.stockmarket}")
    private String stockMarketUrl;

    @Value("${url.stockmarket.detail}")
    private String stockMarketDetailUrl;

    @Value("${url.stockmarket.xu100}")
    private String stockMarketXU100Url;

    private final DozerBeanMapper mapper;

    private final RestTemplate restTemplate = new RestTemplate();

    @Autowired
    public StockMarket(DozerBeanMapper mapper) {
        this.mapper = mapper;
    }

    @RequestMapping(method = RequestMethod.GET)
    public StockMarketViewModel[] home() {
        StockMarketItem[] items = restTemplate.getForObject(stockMarketUrl, StockMarketItem[].class);

        return Arrays.stream(items).map(item -> mapper.map(item, StockMarketViewModel.class))
                .toArray(StockMarketViewModel[]::new);
    }

    @RequestMapping(value = "/Detail", method = RequestMethod.GET)
    public StockMarketDetailViewModel[] detail() {
        StockMarketDetailItem[] items = restTemplate.getForObject(stockMarketDetailUrl, StockMarketDetailItem[].class);

        return Arrays.stream(items).map(item -> mapper.map(item, StockMarketDetailViewModel.class))
                .toArray(StockMarketDetailViewModel[]::new);
    }

    @RequestMapping(value = "/XU100", method = RequestMethod.GET)
    public StockMarketXU100ViewModel xu100() {
        StockMarketXU100Item item = restTemplate.getForObject(stockMarketXU100Url, StockMarketXU100Item.class);

        return mapper.map(item, StockMarketXU100ViewModel.class);
    }
}
