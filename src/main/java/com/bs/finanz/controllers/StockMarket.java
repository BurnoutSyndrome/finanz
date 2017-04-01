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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

//import com.googlecode.jmapper.JMapper;

@RestController
@RequestMapping("/StockMarket")
public class StockMarket {
    @Value("${url.stockmarket}")
    private String stockMarketUrl;

    @Value("${url.stockmarket.detail}")
    private String stockMarketDetailUrl;

    @Value("${url.stockmarket.xu100}")
    private String stockMarketXU100Url;

    @Autowired
    DozerBeanMapper mapper;

    private final RestTemplate restTemplate = new RestTemplate();

    @RequestMapping
    public StockMarketViewModel[] home() {
//        JMapper<StockMarketViewModel, StockMarketItem> mapper = new JMapper<>(StockMarketViewModel.class, StockMarketItem.class);
        StockMarketItem[] items = restTemplate.getForObject(stockMarketUrl, StockMarketItem[].class);

        StockMarketViewModel[] viewModels = Arrays.stream(items).map(item -> mapper.map(item, StockMarketViewModel.class))
                .toArray(StockMarketViewModel[]::new);

        return viewModels;
    }

    @RequestMapping("/Detail")
    public StockMarketDetailViewModel[] detail() {
//        JMapper<StockMarketDetailViewModel, StockMarketDetailItem> mapper = new JMapper<>(StockMarketDetailViewModel.class, StockMarketDetailItem.class);
        StockMarketDetailItem[] items = restTemplate.getForObject(stockMarketDetailUrl, StockMarketDetailItem[].class);

        StockMarketDetailViewModel[] viewModels = Arrays.stream(items).map(item -> mapper.map(item, StockMarketDetailViewModel.class))
                .toArray(StockMarketDetailViewModel[]::new);

        return viewModels;
    }

    @RequestMapping("/XU100")
    public StockMarketXU100ViewModel xu100() {
//        JMapper<StockMarketXU100ViewModel, StockMarketXU100Item> mapper = new JMapper<>(StockMarketXU100ViewModel.class, StockMarketXU100Item.class);
        StockMarketXU100Item item = restTemplate.getForObject(stockMarketXU100Url, StockMarketXU100Item.class);

        StockMarketXU100ViewModel viewModel = mapper.map(item, StockMarketXU100ViewModel.class);

        return viewModel;
    }
}
