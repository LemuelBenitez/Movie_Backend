package com.server.movie.dto;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.server.movie.dao.ReviewRepo;
import com.server.movie.model.Movie;
import com.server.movie.model.Reviews;

@Service
public class ReviewService {
	private ReviewRepo rRepo;

	private MongoTemplate mTemplate;

	ReviewService(ReviewRepo rRepo, MongoTemplate mTemplate) {
		this.rRepo = rRepo;
		this.mTemplate= mTemplate;
	}

	public Reviews createReview(String body, String imdbId) {
		Reviews review = new Reviews(body);
		mTemplate.update(Movie.class).matching(Criteria.where("imdbId").is(imdbId))
				.apply(new Update().push("reviewIds").value(review)).first();
		return review;
	}
}
