package com.server.movie.dao;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.server.movie.model.Movie;

@Repository
public interface MovieRepo extends MongoRepository<Movie, ObjectId> {

	Optional<Movie> findMovieByImdbId(String imdbId);
}
