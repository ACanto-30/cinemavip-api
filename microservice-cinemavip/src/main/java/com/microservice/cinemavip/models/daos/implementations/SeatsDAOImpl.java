package com.microservice.cinemavip.models.daos.implementations;

import com.microservice.cinemavip.models.daos.interfaces.ISeatsDAO;
import com.microservice.cinemavip.models.entities.Seats;
import com.microservice.cinemavip.models.entities.ShowtimeHours;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SeatsDAOImpl implements ISeatsDAO {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Seats> getSeatsByIdShowTimeHours(int id) {
        String jpql = "SELECT s " +
                "FROM ShowtimeHours sh " +
                "JOIN sh.tickets t " +
                "JOIN t.reservedSeats rs " +
                "JOIN rs.seat s " +
                "WHERE sh.idShowtimeHour = :id";

        return em.createQuery(jpql)
                .setParameter("id", id)
                .getResultList();
    }
}

