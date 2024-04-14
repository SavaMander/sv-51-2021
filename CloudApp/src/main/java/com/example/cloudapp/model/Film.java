package com.example.cloudapp.model;
import com.example.cloudapp.CloudAppApplication;
import jakarta.persistence.*;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Value;

import java.util.UUID;

@Entity
@Table(name = "sv_51_2021")
public class Film {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title",nullable = false)
    private String title;
    @Column(name = "genre",nullable = false)
    private String genre;
    @Column(name = "year",nullable = false)
    private int year;

    public Film() {
    }

    public Film(String title, String genre, int year) {
        this.id = UUID.randomUUID().getMostSignificantBits();
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}