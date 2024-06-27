package com.server.movie.dao;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.server.movie.model.Reviews;

@Repository
public interface ReviewRepo extends MongoRepository<Reviews, ObjectId> {

}
