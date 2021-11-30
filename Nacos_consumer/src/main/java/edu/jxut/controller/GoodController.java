package edu.jxut.controller;

import edu.jxut.domain.Good;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/order")
public class GoodController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/getGood/{id}")
    public Good getGood(@PathVariable String id){

        List<ServiceInstance> naco_provider = discoveryClient.getInstances("Naco_provider");
        ServiceInstance serviceInstance = naco_provider.get(0);

        String host = serviceInstance.getHost();
        int port = serviceInstance.getPort();

        String url="http://"+host+":"+port+"/good/getGood/"+id;

        Good good = restTemplate.getForObject(url, Good.class);
        return good;
    }
}
