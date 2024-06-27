package com.server.movie.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document(collection = "reviews")
@AllArgsConstructor
@NoArgsConstructor
public class Reviews {

	@Id
	private ObjectId id;

	private String reviewBody;
//	private LocalDateTime now;

	public Reviews(String reviewBody) {
		this.reviewBody = reviewBody;
	}

//	public Reviews(String body, LocalDateTime now, LocalDateTime now2) {
//		// TODO Auto-generated constructor stub
//		this.reviewBody = body;
//		this.now = now;
//		this.now = now2;
//	}

}
