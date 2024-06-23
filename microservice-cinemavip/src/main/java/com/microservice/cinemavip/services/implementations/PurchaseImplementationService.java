package com.microservice.cinemavip.services.implementations;

import com.microservice.cinemavip.models.daos.interfaces.IPurchaseDAO;
import com.microservice.cinemavip.models.dtos.*;
import com.microservice.cinemavip.models.entities.*;
import com.microservice.cinemavip.models.payload.Responses;
import com.microservice.cinemavip.services.IPurchaseService;
import com.microservice.cinemavip.services.IUserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PurchaseImplementationService implements IPurchaseService {

    @Autowired
    Responses responses;

    @Autowired
    IPurchaseDAO purchaseDAO;

    @Autowired
    IUserService userService;

    @Transactional
    @Override
    public ResponseEntity<?> purchaseTickets(PurchaseDTO purchaseDTO) {

        List<Seats> seats = purchaseDTO.getReservedSeats().stream()
                .map(reservedSeatDTO -> new Seats(
                        reservedSeatDTO.getSeat().getIdSeat(),
                        reservedSeatDTO.getSeat().getPosition(),
                        null))
                .collect(Collectors.toList());
        List<Integer> seatsIds = seats.stream().map(Seats::getIdSeat).collect(Collectors.toList());
        if(purchaseDAO.findIfSeatsArePurchased(seatsIds, purchaseDTO.getShowtimeHour().getIdShowtimeHour()).isEmpty()){
            System.out.println("hola");
            ModelMapper modelMapper = new ModelMapper();

            modelMapper.createTypeMap(ShowtimeHours.class, ShowtimeHoursDTO.class);
            ShowtimeHours showtimeHours = modelMapper.map(purchaseDTO.getShowtimeHour(), ShowtimeHours.class);

            if(purchaseDAO.validateShowtimeAndHour(showtimeHours) != null) {

                modelMapper.createTypeMap(Users.class, UsersDTO.class);
                modelMapper.createTypeMap(Seats.class, SeatsDTO.class);
                Users user = modelMapper.map(purchaseDTO.getUser(), Users.class);

                if (userService.findUser(user) == null)
                    userService.saveUser(user);
                else
                    user = userService.findUser(user);

                Tickets ticket = Tickets.builder()
                        .user(user)
                        .showtimeHour(showtimeHours)
                        .build();

                Tickets savedTicket = purchaseDAO.saveTicket(ticket, user);

                List<ReservedSeats> reservedSeats = purchaseDTO.getReservedSeats().stream()
                        .map(reservedSeatDTO -> {
                            ReservedSeats reservedSeat = new ReservedSeats();
                            reservedSeat.setSeat(modelMapper.map(reservedSeatDTO.getSeat(), Seats.class));
                            reservedSeat.setTickets(savedTicket);
                            return reservedSeat;
                        }).collect(Collectors.toList());

                purchaseDAO.saveAllReservedSeats(reservedSeats);

                return new ResponseEntity<>(responses.getContentResponsePurchase(), HttpStatus.OK);
            }
            else
                return new ResponseEntity<>(responses.getPurchaseResponseNotValidShowtimeHour(), HttpStatus.NOT_FOUND);
        }
        else
            return new ResponseEntity<>(responses.getPurchaseResponseNotValidSeatsReserved(), HttpStatus.NOT_FOUND);
    }
}
