package com.hugoalmeidahh.poc_spring_rest_mongodb.controller;

import com.hugoalmeidahh.poc_spring_rest_mongodb.model.Brewery;
import com.hugoalmeidahh.poc_spring_rest_mongodb.service.BreweryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brewery")
public class BreweryController {
    @Autowired
    BreweryService srv;


    @GetMapping(value = "")
    public Brewery create() {
        return srv.create();
    }
}
