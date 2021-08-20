package com.hugoalmeidahh.poc_spring_rest_mongodb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;


@Component
public class LoadDatabase implements CommandLineRunner {

    @Autowired
    MongoTemplate mongoTemplate;

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Collection Exists? " + mongoTemplate.collectionExists("brewery"));
    }
}
