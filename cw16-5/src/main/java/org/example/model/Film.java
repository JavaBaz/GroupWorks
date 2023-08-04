package org.example.model;


import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    public String title;
    public String description;
    public int length;
    public String language;
    public int rating;
    @Column(nullable = false)
    public String director;



    public Film(String title, String description, int length, String language, int rating, String director) {
        this.title = title;
        this.description = description;
        this.length = length;
        this.language = language;
        this.rating = rating;
        this.director = director;
    }

    public Film() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", length=" + length +
                ", language='" + language + '\'' +
                ", rating=" + rating +
                ", director='" + director + '\'' +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }



}
