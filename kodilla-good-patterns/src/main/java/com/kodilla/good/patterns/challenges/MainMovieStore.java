package com.kodilla.good.patterns.challenges;

public class MainMovieStore {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        movieStore.getMovies().entrySet().stream()
                .flatMap(s->s.getValue().stream())
                .map(d -> d.concat("! "))
                .forEach(System.out::print);
    }
}
