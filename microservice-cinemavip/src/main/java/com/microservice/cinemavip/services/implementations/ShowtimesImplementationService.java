package com.microservice.cinemavip.services.implementations;

import com.microservice.cinemavip.models.daos.interfaces.IShowtimesDAO;
import com.microservice.cinemavip.models.dtos.*;
import com.microservice.cinemavip.models.entities.Movies;
import com.microservice.cinemavip.models.entities.ShowtimeHours;
import com.microservice.cinemavip.models.entities.Showtimes;
import com.microservice.cinemavip.models.entities.Theaters;
import com.microservice.cinemavip.models.payload.Responses;
import com.microservice.cinemavip.services.IShowtimesService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShowtimesImplementationService implements IShowtimesService {

    @Autowired
    IShowtimesDAO showtimesDAO;

    @Autowired
    Responses responses;

    @Override
    @Transactional(readOnly = true)
    public ResponseEntity<?> getShowtimesByMovieId(int id) {
        List<Showtimes> showtimesList = showtimesDAO.getShowtimesByMovieId(id);
        if (showtimesList.isEmpty())
            return new ResponseEntity<>((responses.getNoContentResponseListAll("tanda")), HttpStatus.NOT_FOUND);
        else {
            ModelMapper modelMapper = new ModelMapper();

            modelMapper.createTypeMap(Movies.class, MoviesShowtimesDTO.class);
            modelMapper.createTypeMap(Theaters.class, TheatersDTO.class);
            modelMapper.createTypeMap(ShowtimeHours.class, ShowtimeHoursDTO.class);

            modelMapper.typeMap(Showtimes.class, ShowtimesDTO.class).addMappings(mapper -> {
                mapper.map(src -> src.getMovie(), ShowtimesDTO::setMovie);
                mapper.map(src -> src.getTheater(), ShowtimesDTO::setTheater);
                mapper.map(src -> src.getShowtimeHours(), ShowtimesDTO::setShowtimeHours);
            });

            List<ShowtimesDTO> showtimesDTOList = showtimesList.stream()
                    .map(showtime -> modelMapper.map(showtime, ShowtimesDTO.class))
                    .collect(Collectors.toList());
            return new ResponseEntity<>(showtimesDTOList, HttpStatus.OK);
        }
    }
}
