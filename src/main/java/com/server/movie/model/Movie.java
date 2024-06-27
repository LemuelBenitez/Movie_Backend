package com.server.movie.model;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "movies")
@Getter
@Setter
//@Data
public class Movie {
	@Id
	private ObjectId id;

	private String imdbId;

	private String title;

	private String releaseDate;

	private String trailerLink;

	private String poster;

	private List<String> genres;

	private List<String> backdrops;

	@DocumentReference
	private List<Reviews> reviewIds;

}
