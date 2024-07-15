package com.microservice.cinemavip.services.implementations;

import com.microservice.cinemavip.models.daos.interfaces.ITicketsDAO;
import com.microservice.cinemavip.models.dtos.*;
import com.microservice.cinemavip.models.entities.*;
import com.microservice.cinemavip.models.payload.Responses;
import com.microservice.cinemavip.services.ITicketsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TicketsImplementationService implements ITicketsService {

    @Autowired
    ITicketsDAO ticketsDAO;

    @Autowired
    Responses responses;

    @Override
    public ResponseEntity<?> getLastTicketByUser(UsersDTO usersDTO) {
        Users user = Users.builder()
                .firstName(usersDTO.getFirstName())
                .lastName(usersDTO.getLastName())
                .email(usersDTO.getEmail())
                .build();
        Tickets ticket = ticketsDAO.getLastTicketByUser(user);
        if (ticket != null)
        {
            ModelMapper modelMapper = new ModelMapper();
            modelMapper.createTypeMap(Tickets.class, TicketsDTO.class);
            modelMapper.createTypeMap(ShowtimeHours.class, ShowtimeHoursDTO.class);
            modelMapper.createTypeMap(Users.class, UsersTicketDTO.class);
            modelMapper.createTypeMap(Showtimes.class, ShowtimesTicketsDTO.class);
            modelMapper.createTypeMap(Movies.class, MoviesShowtimesDTO.class);
            modelMapper.createTypeMap(Theaters.class, TheatersDTO.class);
            modelMapper.createTypeMap(ReservedSeats.class, ReservedSeatsDTO.class);
            modelMapper.createTypeMap(Seats.class, SeatsDTO.class);

            TicketsSeatsDTO ticketDTO = modelMapper.map(ticket, TicketsSeatsDTO.class);
            return new ResponseEntity<>(ticketDTO, HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(responses.getNoTicketsUser(), HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<?> getAllTicketsByUser(UsersDTO usersDTO) {
        Users user = Users.builder()
                .firstName(usersDTO.getFirstName())
                .lastName(usersDTO.getLastName())
                .email(usersDTO.getEmail())
                .build();
        List<Tickets> ticketsList = ticketsDAO.getAllTicketsByUser(user);
        if (!ticketsList.isEmpty())
        {
            ModelMapper modelMapper = new ModelMapper();
            modelMapper.createTypeMap(ShowtimeHours.class, ShowtimeHoursDTO.class);
            modelMapper.createTypeMap(Users.class, UsersTicketDTO.class);
            modelMapper.createTypeMap(Showtimes.class, ShowtimesTicketsDTO.class);
            modelMapper.createTypeMap(Movies.class, MoviesShowtimesDTO.class);
            modelMapper.createTypeMap(Theaters.class, TheatersDTO.class);
            modelMapper.createTypeMap(ReservedSeats.class, ReservedSeatsDTO.class);
            modelMapper.createTypeMap(Seats.class, SeatsDTO.class);

            List<TicketsSeatsDTO> ticketsListDTO = ticketsList.stream()
                    .map(ticket -> modelMapper.map(ticket, TicketsSeatsDTO.class))
                    .collect(Collectors.toList());
            return new ResponseEntity<>(ticketsListDTO, HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(responses.getNoTicketsUser(), HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<?> getTicketById(int id) {
        Tickets ticket = ticketsDAO.getTicketById(id);
        if (ticket != null) {
            ModelMapper modelMapper = new ModelMapper();
            modelMapper.createTypeMap(Tickets.class, TicketsDTO.class);
            modelMapper.createTypeMap(ShowtimeHours.class, ShowtimeHoursDTO.class);
            modelMapper.createTypeMap(Users.class, UsersTicketDTO.class);
            modelMapper.createTypeMap(Showtimes.class, ShowtimesTicketsDTO.class);
            modelMapper.createTypeMap(Movies.class, MoviesShowtimesDTO.class);
            modelMapper.createTypeMap(Theaters.class, TheatersDTO.class);
            modelMapper.createTypeMap(ReservedSeats.class, ReservedSeatsDTO.class);
            modelMapper.createTypeMap(Seats.class, SeatsDTO.class);

            TicketsSeatsDTO ticketDTO = modelMapper.map(ticket, TicketsSeatsDTO.class);
            return new ResponseEntity<>(ticketDTO, HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(responses.getNoTicketsUser(), HttpStatus.NOT_FOUND);
    }


}
