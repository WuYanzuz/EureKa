package edu.jxut.controller;

import edu.jxut.domain.Good;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class GoodController {

    @Value("${rest.url}")
    private String url;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/goods/{id}")
    public Good findGoodById(@PathVariable("id") String id){
        System.out.println(url);
        Good good = restTemplate.getForObject(url, Good.class);
        return good;
    }
}
