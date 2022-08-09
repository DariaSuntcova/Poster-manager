package ru.netology.poster;

import ru.netology.repository.MovieRepository;

public class PosterManager {

    private MovieRepository repo;
    private int countMovies = 10;

    public PosterManager(MovieRepository repo) {
        this.repo = repo;
    }


    public PosterManager(int countMovies, MovieRepository repo) {
        if (countMovies >= 0) {
            this.countMovies = countMovies;
        }
        this.repo = repo;

    }


    public void addNewMovie(Movie movie) {
        repo.save(movie);
    }

    public Movie[] findAll() {
        return repo.findAll();
    }

    public Movie[] findLast() {
        Movie[] movies = repo.findAll();
        Movie[] result = new Movie[Math.min((movies.length), countMovies)];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }



}


