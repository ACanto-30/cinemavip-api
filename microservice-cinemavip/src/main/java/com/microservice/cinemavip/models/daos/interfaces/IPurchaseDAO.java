package com.microservice.cinemavip.models.daos.interfaces;

import com.microservice.cinemavip.models.entities.*;

import java.util.List;

public interface IPurchaseDAO {
    Tickets saveTicket(Tickets ticket, Users user);
    List<Seats> findIfSeatsArePurchased(List<Integer> seatsIds, int idShowtimeHour);
    void saveAllReservedSeats(List<ReservedSeats> reservedSeats);
    ShowtimeHours validateShowtimeAndHour(ShowtimeHours showtimeHours);
}
