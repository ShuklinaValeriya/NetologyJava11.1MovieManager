import org.junit.jupiter.api.Test;
import ru.netology.domain.Afisha;
import ru.netology.manager.MovieManager;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {
    Afisha first = new Afisha(1, "Бладшот", "боевик");
    Afisha second = new Afisha(2, "Вперёд", "мульт");
    Afisha third = new Afisha(3, "Отель Белград", "ком");
    Afisha fourth = new Afisha(4, "Джентельмены", "боевик");
    Afisha fifth = new Afisha(5, "Человек-невидимка", "боевик");
    Afisha sixth = new Afisha(6, "Тролли. Мировой тур", "боевик");
    Afisha seventh = new Afisha(7, "Номер один", "боевик");
    Afisha eighth = new Afisha(8, "Брат", "боевик");
    Afisha ninth = new Afisha(9, "50 оттенков серого", "боевик");
    Afisha tenth = new Afisha(10, "Он вам не Димон", "боевик");

    @Test
    public void findLastMovieCountOverMassiveTest() {
        MovieManager manager = new MovieManager(7);
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);

        Afisha[] expected = new Afisha[]{third, second, first};
        Afisha[] actual = manager.findLast();
        assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastMovieCountEquallyMassiveTest() {
        MovieManager manager = new MovieManager(4);
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);

        Afisha[] expected = new Afisha[]{fourth, third, second, first};
        Afisha[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMovieCountOverMassiveNoParamsTest() {
        MovieManager manager = new MovieManager();
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);

        Afisha[] expected = new Afisha[]{third, second, first};
        Afisha[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMovieCountEquallyMassiveNoParamsTest() {
        MovieManager manager = new MovieManager();
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eighth);
        manager.addMovie(ninth);
        manager.addMovie(tenth);

        Afisha[] expected = new Afisha[]{tenth, ninth, eighth, seventh,
                sixth, fifth, fourth, third, second, first};
        Afisha[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

}