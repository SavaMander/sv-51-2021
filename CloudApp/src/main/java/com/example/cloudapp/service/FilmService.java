package com.example.cloudapp.service;

import com.example.cloudapp.model.Film;
import com.example.cloudapp.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class FilmService {

    @Autowired
    private FilmRepository filmRepository;

    public Film createFilm(Film film){
        filmRepository.save(film);
        return film;
    }

    public Collection<Film> getAllFilms(){
        return filmRepository.findAll();
    }
}
