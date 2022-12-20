package com.example.Libanaws.controllers;



import com.example.Libanaws.models.Movie;
import com.example.Libanaws.models.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    MovieRepository movieRepository;

    @GetMapping("/")
    public String hello(){
        return "Code Build";
    }

    @GetMapping("/all")
    public List<Movie> getMovies(){
        return (List<Movie>) movieRepository.findAll();
    }

    @PostMapping("create")
    public void createMovie(@RequestBody Movie movie){
        movieRepository.save(movie);
    }
}
