package edu.jxut.mapper;

import edu.jxut.domain.Good;
import org.springframework.stereotype.Component;

@Component
public class GoodMapper {

    public Good getGood(String id){
        return Good.builder().id(id).price(20.4).name("牛逼").build();
    }
}
