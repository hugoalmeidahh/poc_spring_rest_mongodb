package com.hugoalmeidahh.poc_spring_rest_mongodb.repository;

import com.hugoalmeidahh.poc_spring_rest_mongodb.model.Brewery;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BreweryRepository extends MongoRepository<Brewery, String> {
}
