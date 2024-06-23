package com.microservice.cinemavip.models.daos.implementations;

import com.microservice.cinemavip.models.daos.interfaces.IUserDAO;
import com.microservice.cinemavip.models.entities.Users;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements IUserDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Users user) {
        this.em.persist(user);
        this.em.flush();
    }

    public Users searchUser(Users user) {
        String jpql = "SELECT u FROM Users u WHERE u.firstName = :firstName AND u.lastName = :lastName AND u.email = :email";
        TypedQuery<Users> query = em.createQuery(jpql, Users.class);
        query.setParameter("firstName", user.getFirstName());
        query.setParameter("lastName", user.getLastName());
        query.setParameter("email", user.getEmail());

        try {
            Users result = query.getSingleResult();
            return result;
        } catch (NoResultException e) {
            return user = null;
        }
    }
}
