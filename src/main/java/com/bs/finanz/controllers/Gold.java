package com.bs.finanz.controllers;

import com.bs.finanz.models.GoldItem;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Gold {
    @Value("${url.gold}")
    private String goldUrl;

    @RequestMapping("/Gold")
    public GoldItem[] home() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(goldUrl, GoldItem[].class);
    }
}
