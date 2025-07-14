package com.MH.movie_review.repository;

import com.MH.movie_review.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}