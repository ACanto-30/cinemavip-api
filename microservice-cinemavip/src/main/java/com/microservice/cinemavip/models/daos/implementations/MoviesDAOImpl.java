package com.microservice.cinemavip.models.daos.implementations;

import com.microservice.cinemavip.models.daos.interfaces.IMoviesDAO;
import com.microservice.cinemavip.models.entities.Movies;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MoviesDAOImpl implements IMoviesDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Movies> listAllMovies() {
        String jpql = "SELECT m FROM Movies m " +
                "WHERE m.releaseDate <= CURRENT_DATE";
        TypedQuery<Movies> query = em.createQuery(jpql, Movies.class);
        return query.getResultList();
    }

    @Override
    public Movies getMovieById(int id) {
        return em.find(Movies.class, id);
    }

    @Override
    public List<Movies> listComingSoonMovies() {
        String jpql = "SELECT m FROM Movies m " +
                "WHERE  m.releaseDate >= CURRENT_DATE";
        TypedQuery<Movies> query = em.createQuery(jpql, Movies.class);
        return query.getResultList();
    }
}
