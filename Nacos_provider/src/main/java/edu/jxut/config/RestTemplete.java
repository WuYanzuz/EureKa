package edu.jxut.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplete {

    @Bean
    public RestTemplate getRest(){
        return new RestTemplate();
    }
}
