package ru.netology.repository;

import ru.netology.poster.Movie;

public class MovieRepository {
    private Movie[] movies = new Movie[0];

    public void save(Movie movie) {
        Movie[] tmp = new Movie[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public Movie[] findAll() {
        return movies;
    }

    public Movie findById(int id) {
        for (Movie movie : movies) {
            if (movie.getId() == id) {
                return movie;
            }
        }
        return null;
    }

    public void removeById(int id) {
        if (findById(id) != null) {
            Movie[] tmp = new Movie[movies.length - 1];
            int index = 0;
            for (Movie movie : movies) {
                if (movie.getId() != id) {
                    tmp[index] = movie;
                    index++;
                }
            }
            movies = tmp;
        }
    }

    public void removeAll() {
        movies = new Movie[0];
    }


}
