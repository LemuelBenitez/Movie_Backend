package com.server.movie.dto;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import com.server.movie.dao.MovieRepo;
import com.server.movie.model.Movie;

@Service
public class MovieService {
	private MovieRepo mRepo;

	public MovieService(MovieRepo mRepo) {
		this.mRepo = mRepo;
	}

	public List<Movie> allMovies() {
		return mRepo.findAll();
	}

	public Optional<Movie> findMovie(ObjectId id) {
		return mRepo.findById(id);
	}

	public Optional<Movie> findMovie(String imdbId) {
		return mRepo.findMovieByImdbId(imdbId);
	}

}
