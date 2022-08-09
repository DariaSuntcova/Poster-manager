package ru.netology.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.repository.MovieRepository;

import static org.mockito.Mockito.*;

public class PosterManagerTest {
    MovieRepository repo = Mockito.mock(MovieRepository.class);
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

    @Test
    public void shouldFindAll() {
        Movie[] movies = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10, movie11};
        doReturn(movies).when(repo).findAll();

        Movie[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10, movie11};

        Movie[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

}
