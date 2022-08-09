package ru.netology.poster;


public class Movie {
    private String nameMovie;
    private String movieGenre;




    public Movie(String nameMovie, String movieGenre) {
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
}
