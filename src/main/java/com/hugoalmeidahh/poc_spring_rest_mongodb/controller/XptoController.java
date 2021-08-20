package com.hugoalmeidahh.poc_spring_rest_mongodb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/xpto")
public class XptoController {
    @GetMapping(value = "/")
    public String getStatus() {
        return "Iám alive!!!";
    }
}
