package com.example.cloudapp.controller;

import com.example.cloudapp.model.Film;
import com.example.cloudapp.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin
@RequestMapping("api/film")
public class FilmController {

    @Autowired
    private FilmService filmService;

    @PostMapping
    public ResponseEntity<Film> createFilm(@RequestBody Film film){
        Film returned = filmService.createFilm(film);
        return ResponseEntity.ok(returned);
    }

    @GetMapping
    public ResponseEntity<Collection<Film>> getAllFilms(){
        Collection<Film> films = filmService.getAllFilms();
        return ResponseEntity.ok(films);
    }
}
