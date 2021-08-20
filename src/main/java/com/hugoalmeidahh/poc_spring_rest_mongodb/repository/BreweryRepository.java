package com.hugoalmeidahh.poc_spring_rest_mongodb.repository;

import com.hugoalmeidahh.poc_spring_rest_mongodb.model.Brewery;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BreweryRepository extends MongoRepository<Brewery, String> {


}
