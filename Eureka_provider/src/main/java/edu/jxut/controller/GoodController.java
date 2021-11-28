package edu.jxut.controller;

import edu.jxut.domain.Goods;
import edu.jxut.server.GoodsServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goods")
public class GoodController {
    @Autowired
    private GoodsServer goodsServer;

    @GetMapping("/getGoods/{id}")
    public Goods getGoods(@PathVariable("id") String id){
        return goodsServer.selectOne(id);
    }
}
