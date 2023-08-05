package org.example.repository;

import org.example.model.Film;

import java.util.List;

public interface FilmRepository {

    void save(Film film);
    Film findById(long id);

    List<Film> findAll();
    void update(Film film);
    void remove(Film film);


}
