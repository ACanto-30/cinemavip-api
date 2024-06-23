package com.microservice.cinemavip.models.daos.implementations;

import com.microservice.cinemavip.models.daos.interfaces.ITicketsDAO;
import com.microservice.cinemavip.models.entities.Tickets;
import com.microservice.cinemavip.models.entities.Users;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TicketsDAOImpl implements ITicketsDAO {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Tickets getLastTicketByUser(Users user) {
        String jpql = "SELECT t FROM Tickets t " +
                "JOIN FETCH t.user u " +
                "JOIN FETCH t.showtimeHour sh " +
                "JOIN FETCH sh.showtime st " +
                "JOIN FETCH st.movie " +
                "JOIN FETCH st.theater " +
                "WHERE u.firstName = :firstName AND u.lastName = :lastName AND u.email = :email " +
                "ORDER BY t.idTicket DESC";
        TypedQuery<Tickets> query = em.createQuery(jpql, Tickets.class)
                .setParameter("firstName", user.getFirstName())
                .setParameter("lastName", user.getLastName())
                .setParameter("email", user.getEmail());
        return query.setMaxResults(1).getSingleResult();
    }

    @Override
    public List<Tickets> getAllTicketsByUser(Users user) {
        String jpql = "SELECT t FROM Tickets t " +
                "JOIN FETCH t.user u " +
                "JOIN FETCH t.showtimeHour sh " +
                "JOIN FETCH sh.showtime st " +
                "JOIN FETCH st.movie " +
                "JOIN FETCH st.theater " +
                "WHERE u.firstName = :firstName AND u.lastName = :lastName AND u.email = :email " +
                "ORDER BY t.idTicket ASC";
        TypedQuery<Tickets> query = em.createQuery(jpql, Tickets.class)
                .setParameter("firstName", user.getFirstName())
                .setParameter("lastName", user.getLastName())
                .setParameter("email", user.getEmail());
        return query.getResultList();
    }

}
