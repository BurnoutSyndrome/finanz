package com.bs.finanz.controllers;

import com.bs.finanz.data.models.GoldItem;
import com.bs.finanz.data.viewmodels.GoldViewModel;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
@RequestMapping(value = "/Gold", method = RequestMethod.GET)
public class Gold {
    @Value("${url.gold}")
    private String goldUrl;

    private final DozerBeanMapper mapper;

    @Autowired
    public Gold(DozerBeanMapper mapper) {
        this.mapper = mapper;
    }

    @RequestMapping
    public GoldViewModel[] home() {
        RestTemplate restTemplate = new RestTemplate();
        GoldItem[] items = restTemplate.getForObject(goldUrl, GoldItem[].class);

        return Arrays.stream(items).map(item -> mapper.map(item, GoldViewModel.class))
                .toArray(GoldViewModel[]::new);
    }
}
