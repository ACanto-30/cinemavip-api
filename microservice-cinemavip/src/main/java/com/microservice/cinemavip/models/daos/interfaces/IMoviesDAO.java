package com.microservice.cinemavip.models.daos.interfaces;

import com.microservice.cinemavip.models.entities.Movies;

import java.util.List;

public interface IMoviesDAO {
    List<Movies> listAllMovies();
    Movies getMovieById(int id);
}
