package com.vj.firstapplication;

import java.util.ArrayList;
import java.util.List;

public class MovieExpert {
    public List<String> getMovies(String hero) {
        List<String> movies = new ArrayList<>();
        switch (hero) {
            case "Vijay" -> {
                movies.add("GOAT");
                movies.add("LEO");
            }
            case "Ajith" ->{
                movies.add("Vidamuyarchi");
                movies.add("Good Bad Ugly");
            }
            case "Rajini" -> {
                movies.add("Endhiran");
                movies.add("Coolie");
            }
            default -> movies.add("Please Select Hero");
        }
        return movies;
    }
}
