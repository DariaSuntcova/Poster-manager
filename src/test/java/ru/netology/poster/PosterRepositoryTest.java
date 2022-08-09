package ru.netology.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.repository.MovieRepository;


public class PosterRepositoryTest {
    MovieRepository repo = new MovieRepository();
    PosterManager manager = new PosterManager(repo);

    Movie movie1 = new Movie(1, "Пёс-самурай и город кошек", "анимация, комедия");
    Movie movie2 = new Movie(2, "Одна", "драма, триллер");
    Movie movie3 = new Movie(3, "Клаустрофобы. Долина дьявола", "хоррор");
    Movie movie4 = new Movie(4, "Кощей. Похититель невест", "анимация, мелодрама");
    Movie movie5 = new Movie(5, "Дом дракона", "фэнтези, боевик");
    Movie movie6 = new Movie(6, "Человек-паук: Возвращение домой", "фантастика, боевик, приключения");
    Movie movie7 = new Movie(7, "Не звезди!", "комедия");
    Movie movie8 = new Movie(8, "Большое путешествие", "мультфильм, комедия, приключения, семейный");
    Movie movie9 = new Movie(9, "Главная роль", "драма, комедия");
    Movie movie10 = new Movie(10, "Паразиты", "драма, триллер, комедия");
    Movie movie11 = new Movie(11, "Леон", "боевик, триллер, драма, криминал");


    @BeforeEach
    public void setup() {
        manager.addNewMovie(movie1);
        manager.addNewMovie(movie2);
        manager.addNewMovie(movie3);
        manager.addNewMovie(movie4);
        manager.addNewMovie(movie5);
        manager.addNewMovie(movie6);
        manager.addNewMovie(movie7);
        manager.addNewMovie(movie8);
        manager.addNewMovie(movie9);
        manager.addNewMovie(movie10);
        manager.addNewMovie(movie11);
    }

    @Test
    public void shouldFindAll() {
        Movie[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10, movie11};

        Movie[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWithTenMovies() {
        Movie[] expected = {movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2};

        Movie[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindWithFiveMovies() {
        PosterManager manager = new PosterManager(5, repo);

        Movie[] expected = {movie11, movie10, movie9, movie8, movie7};

        Movie[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastWithOneMovie() {
        PosterManager manager = new PosterManager(1, repo);

        Movie[] expected = {movie11};

        Movie[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWithoutMovies() {
        PosterManager poster = new PosterManager(0, repo);

        Movie[] expected = {};

        Movie[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastBelowZero() {
        PosterManager poster = new PosterManager(-1, repo);


        Movie[] expected = {movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2};

        Movie[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoreThanIs() {
        PosterManager poster = new PosterManager(20, repo);

        Movie[] expected = {movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};

        Movie[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}
