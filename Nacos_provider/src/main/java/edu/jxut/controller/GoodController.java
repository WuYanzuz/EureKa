package edu.jxut.controller;

import edu.jxut.domain.Good;
import edu.jxut.server.GoodServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/good")
public class GoodController {

    @Autowired
    private GoodServer goodServer;

    @GetMapping("getGood/{id}")
    public Good getGood(@PathVariable String id){
        Good good = goodServer.getGood(id);
        return good;
    }
}
