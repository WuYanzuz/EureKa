package edu.jxut.server;

import edu.jxut.domain.Good;
import edu.jxut.mapper.GoodMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GoodServer {
    @Autowired
    private GoodMapper goodMapper;
    
    public Good getGood(String id){
        Good good = goodMapper.getGood(id);
        return good;
    }
}
