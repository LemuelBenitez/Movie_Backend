package com.server.movie.comtroller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.server.movie.dto.ReviewService;
import com.server.movie.model.Reviews;

@RestController
@RequestMapping("api/v1/reviews")
@CrossOrigin(origins = "http://localhost:5173")
public class ReviewController {
	@Autowired
	private ReviewService rService;

	@PostMapping
	public ResponseEntity<Reviews> createReview(@RequestBody Map<String, String> payload) {
		return new ResponseEntity<Reviews>(rService.createReview(payload.get("reviewBody"), payload.get("imdbId")),
				HttpStatus.CREATED);
	}

}
