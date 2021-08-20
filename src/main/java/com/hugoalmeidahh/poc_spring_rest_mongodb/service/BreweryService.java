package com.hugoalmeidahh.poc_spring_rest_mongodb.service;

import com.hugoalmeidahh.poc_spring_rest_mongodb.model.Brewery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class BreweryService {
    @Autowired
    MongoTemplate mongoTemplate;

    public Brewery create(){
        Brewery brewery = new Brewery("FoursBears", "SJC", "SP");

        mongoTemplate.insert(brewery, "brewery");

        return brewery;
    }
}
