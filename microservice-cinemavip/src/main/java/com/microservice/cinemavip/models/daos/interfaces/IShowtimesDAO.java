package com.microservice.cinemavip.models.daos.interfaces;

import com.microservice.cinemavip.models.entities.Showtimes;

import java.util.List;

public interface IShowtimesDAO {
    List<Showtimes> getShowtimesByMovieId(int movieId);
}
