package com.microservice.cinemavip.models.daos.implementations;

import com.microservice.cinemavip.models.daos.interfaces.IShowtimesDAO;
import com.microservice.cinemavip.models.entities.Showtimes;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ShowtimesDAOImpl implements IShowtimesDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Showtimes> getShowtimesByMovieId(int movieId) {
        String jpql = "select st from Showtimes st join fetch st.theater t join fetch st.showtimeHours sh where st.movie.id = :movieId and sh.showtimeHour > CURRENT_DATE and st.showtimeDate > CURRENT_DATE";
        TypedQuery<Showtimes> query = em.createQuery(jpql, Showtimes.class);
        query.setParameter("movieId", movieId);
        return query.getResultList();
    }
}
