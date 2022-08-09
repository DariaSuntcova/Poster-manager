package ru.netology.poster;


public class Movie {

    private int id;
    private String nameMovie;
    private String movieGenre;


    public Movie(int id, String nameMovie, String movieGenre) {
        this.id = id;
        this.nameMovie = nameMovie;
        this.movieGenre = movieGenre;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
