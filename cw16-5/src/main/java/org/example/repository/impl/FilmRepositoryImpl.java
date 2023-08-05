package org.example.repository.impl;

import org.example.config.AppEntityManagerFactory;
import org.example.model.Film;
import org.example.repository.FilmRepository;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

public class FilmRepositoryImpl implements FilmRepository {


    private final EntityManagerFactory entityManagerFactory = AppEntityManagerFactory.getEntityManagerFactory();
    private final EntityManager entityManager = entityManagerFactory.createEntityManager();


    @Override
    public void save(Film film) {
        entityManager.getTransaction().begin();
        entityManager.persist(film);
        entityManager.getTransaction().commit();


    }


    @Override
    public Film findById(long id) {
        Film toBeReturnedFilm;

        entityManager.getTransaction().begin();
        toBeReturnedFilm = entityManager.find(Film.class, id);
        entityManager.getTransaction().commit();

        return toBeReturnedFilm;
    }



    @Override
    public List<Film> findAll() {
        entityManager.getTransaction().begin();
        List toBeReturnedFilms = entityManager.createQuery("FROM Film").getResultList();
        return toBeReturnedFilms;
    }

    @Override
    public void update(Film film) {
        entityManager.getTransaction().begin();
        entityManager.merge(film);
        entityManager.getTransaction().commit();

    }

    @Override
    public void remove(Film film) {

    }
}
