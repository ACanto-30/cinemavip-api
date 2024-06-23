package com.microservice.cinemavip.models.daos.implementations;

import com.microservice.cinemavip.models.daos.interfaces.IPurchaseDAO;
import com.microservice.cinemavip.models.entities.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public class PurchaseDAOImpl implements IPurchaseDAO {
    @PersistenceContext
    private EntityManager em;


    @Override
    public Tickets saveTicket(Tickets ticket, Users user) {
        em.persist(ticket);
        em.flush();
        return ticket;
    }

    @Override
    public void saveAllReservedSeats(List<ReservedSeats> reservedSeats) {
        for (ReservedSeats reservedSeat : reservedSeats) {
            em.persist(reservedSeat);
            em.flush();
        }
    }

    @Override
    public List<Seats> findIfSeatsArePurchased(List<Integer> seatsIds, int idShowtimeHour) {
        String jpql = "SELECT s " +
                "FROM ShowtimeHours sh " +
                "JOIN sh.tickets t " +
                "JOIN t.reservedSeats rs " +
                "JOIN rs.seat s " +
                "WHERE sh.idShowtimeHour = :idShowtimeHour AND " +
                "s.idSeat IN :seats";
        TypedQuery<Seats> query = em.createQuery(jpql, Seats.class);
        query.setParameter("seats", seatsIds);
        query.setParameter("idShowtimeHour", idShowtimeHour);
        return query.getResultList();
    }

    @Override
    public ShowtimeHours validateShowtimeAndHour(ShowtimeHours showtimeHours) {
        String jpql = "SELECT sh " +
                "FROM ShowtimeHours sh " +
                "JOIN sh.showtime st " +
                "JOIN sh.tickets t " +
                "JOIN t.reservedSeats rs " +
                "JOIN rs.seat s " +
                "WHERE sh.idShowtimeHour = :idShowtimeHour " +
                "AND st.showtimeDate > :date " +
                "AND sh.showtimeHour = :hour ";
        TypedQuery<ShowtimeHours> query = em.createQuery(jpql, ShowtimeHours.class);
        query.setParameter("idShowtimeHour", showtimeHours.getIdShowtimeHour());
        query.setParameter("date", LocalDate.now());
        query.setParameter("hour", showtimeHours.getShowtimeHour());
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
}
