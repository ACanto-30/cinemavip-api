package com.microservice.cinemavip.services.implementations;

import com.microservice.cinemavip.models.daos.interfaces.IMoviesDAO;
import com.microservice.cinemavip.models.dtos.ClassificationsDTO;
import com.microservice.cinemavip.models.dtos.MoviesDTO;
import com.microservice.cinemavip.models.entities.Classifications;
import com.microservice.cinemavip.models.entities.Movies;
import com.microservice.cinemavip.models.payload.Responses;
import com.microservice.cinemavip.services.IMoviesService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MoviesImplementationService implements IMoviesService {

    @Autowired
    private IMoviesDAO moviesDAO;

    @Autowired
    private Responses responses;

    @Override
    @Transactional(readOnly = true)
    public ResponseEntity<?> listAllMovies() {
        List<Movies> moviesList = moviesDAO.listAllMovies();
        ModelMapper modelMapper = new ModelMapper();

        if(moviesList.isEmpty())
            return new ResponseEntity<>(responses.getNoContentResponseListAll("peliculas"), HttpStatus.NOT_FOUND);
        else{
            modelMapper.createTypeMap(Classifications.class, ClassificationsDTO.class);

            modelMapper.typeMap(Movies.class, MoviesDTO.class).addMappings(mapper -> {
                mapper.skip(MoviesDTO::setIdClassification);
            });


            List<MoviesDTO> moviesDTOList = moviesList.stream()
                    .map(movie -> modelMapper.map(movie, MoviesDTO.class))
                    .collect(Collectors.toList());
            return new ResponseEntity<>(moviesDTOList, HttpStatus.OK);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public ResponseEntity<?> getMovieById(int movieId) {
        Movies movie = moviesDAO.getMovieById(movieId);

        if (movie != null) {
            ModelMapper modelMapper = new ModelMapper();
            modelMapper.createTypeMap(Classifications.class, ClassificationsDTO.class);
            modelMapper.typeMap(Movies.class, MoviesDTO.class).addMappings(mapper -> {
                mapper.map(src -> src.getClassification(), MoviesDTO::setIdClassification);
            });

            MoviesDTO movieDTO = modelMapper.map(movie, MoviesDTO.class);
            return new ResponseEntity<>(movieDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(responses.getNoContentResponseById("pelicula", movieId), HttpStatus.NOT_FOUND);
        }
    }
}

