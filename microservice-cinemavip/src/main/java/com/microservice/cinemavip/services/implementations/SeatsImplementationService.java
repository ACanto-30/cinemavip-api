package com.microservice.cinemavip.services.implementations;

import com.microservice.cinemavip.models.daos.interfaces.ISeatsDAO;
import com.microservice.cinemavip.models.dtos.SeatsDTO;
import com.microservice.cinemavip.models.entities.*;
import com.microservice.cinemavip.models.payload.Responses;
import com.microservice.cinemavip.services.ISeatsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SeatsImplementationService implements ISeatsService {

    @Autowired
    ISeatsDAO seatsDAO;

    @Autowired
    Responses responses;


    @Override
    @Transactional(readOnly = true)
    public ResponseEntity<?> getSeatsByIdShowTimeHours(int id) {
        List<Seats> seatsList = seatsDAO.getSeatsByIdShowTimeHours(id);
        if(!seatsList.isEmpty()) {
            ModelMapper modelMapper = new ModelMapper();
            List<SeatsDTO> seatsDTO = seatsList.stream()
                .map(seats -> modelMapper.map(seats, SeatsDTO.class))
                    .collect(Collectors.toList());
            return new ResponseEntity<>(seatsDTO, HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(responses.getNoContentResponseById("asientos", id), HttpStatus.NOT_FOUND);
    }
}
