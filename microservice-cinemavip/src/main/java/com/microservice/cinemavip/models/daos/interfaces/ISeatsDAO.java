package com.microservice.cinemavip.models.daos.interfaces;

import com.microservice.cinemavip.models.entities.Seats;
import com.microservice.cinemavip.models.entities.ShowtimeHours;

import java.util.List;

public interface ISeatsDAO {
    List<Seats> getSeatsByIdShowTimeHours(int id);
}
