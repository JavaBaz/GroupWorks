package org.example;

import org.example.model.Film;
import org.example.repository.FilmRepository;
import org.example.repository.impl.FilmRepositoryImpl;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        FilmRepository filmRepository = new FilmRepositoryImpl();


        Film film2 = new Film("dastan haye amirAli va saber", "yek film bad",100,"Farsi",1,"Amin");


        film2.setId(2L);
        film2.setDirector("Mahdiiiiiii");
//        filmRepository.update(film2);


//        System.out.println(filmRepository.findById(1));

        filmRepository.remove(film2);
    }
}