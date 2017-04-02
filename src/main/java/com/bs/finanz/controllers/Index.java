package com.bs.finanz.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index {
    @Value("${url.swagger}")
    private String swaggerUrl;

    @RequestMapping("/")
    public String home() {
        return String.format("redirect:/%s", swaggerUrl);
    }
}
