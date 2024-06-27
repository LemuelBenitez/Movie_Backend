package com.server.movie.comtroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.server.movie.dto.MovieService;
import com.server.movie.model.Movie;

@RestController
@RequestMapping("/api/v1/movies")
@CrossOrigin(origins = "http://localhost:5173")
public class MovieController {

	@Autowired
	private MovieService mService;

	@GetMapping("/test")
	public String hello() {
		return "<h1>First API call: EndPoint</h1>";
	}

	@GetMapping
	public ResponseEntity<List<Movie>> allMovies() {
		return new ResponseEntity<List<Movie>>(mService.allMovies(), HttpStatus.OK);
	}

//	@GetMapping("/{id}")
//	public ResponseEntity<Optional<Movie>> getMovie(@PathVariable ObjectId id) {
//		return new ResponseEntity<Optional<Movie>>(mService.findMovie(id), HttpStatus.OK);
//	}

	@GetMapping("/{imdbId}")
	public ResponseEntity<Optional<Movie>> getMovie(@PathVariable String imdbId) {
		return new ResponseEntity<Optional<Movie>>(mService.findMovie(imdbId), HttpStatus.OK);
	}
}
