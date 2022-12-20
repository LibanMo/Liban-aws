package com.example.Libanaws.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {
    private String title;
    private String director;
    private int year;
    private int genreId;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    public Movie(String title, String director, int year, int genreId) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.genreId = genreId;
    }

    public Movie() {

    }

    public Integer getGenre() {
        return genreId;
    }

    public void setGenre(Integer id) {
        this.genreId = id;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }


    public void setTitle(String v)
    {
        title = v;
    }


    public String getTitle()
    {
        return title;
    }

    public void setDirector(String v)
    {
        director = v;
    }


    public String getDirector()
    {
        return director;
    }

}
