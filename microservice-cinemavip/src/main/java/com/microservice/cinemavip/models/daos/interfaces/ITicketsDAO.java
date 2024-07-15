package com.microservice.cinemavip.models.daos.interfaces;

import com.microservice.cinemavip.models.entities.*;

import java.util.List;

public interface ITicketsDAO {
    Tickets getLastTicketByUser(Users user);
    List<Tickets> getAllTicketsByUser(Users user);
    Tickets getTicketById(int id);
}
