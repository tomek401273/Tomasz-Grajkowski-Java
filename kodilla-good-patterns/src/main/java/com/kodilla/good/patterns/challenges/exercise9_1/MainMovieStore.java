package com.kodilla.good.patterns.challenges.exercise9_1;

import java.util.stream.Collectors;

public class MainMovieStore {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        movieStore.getMovies().entrySet().stream()
                .flatMap(s->s.getValue().stream())
                .map(d -> d.concat("! "))
                .forEach(System.out::print);
        System.out.println();
        String x =  movieStore.getMovies().entrySet().stream()
                .flatMap(s->s.getValue().stream())
                .collect(Collectors.joining("! ")) +"!";

        System.out.println(x);
    }
}
