import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//public Afisha(int id, String name, String tape) {
//        this.id = id;
//        this.name = name;
//        this.tape = tape;
//        }

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
    public void findLastTest() {
        MovieManager manager = new MovieManager(7);
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);

        Afisha[] expected = new Afisha[]{third, second, first};
        Afisha[] actual = manager.findLast();
        assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastTest1() {
        MovieManager manager = new MovieManager(4);
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);

        Afisha[] expected = new Afisha[]{fourth, third, second, first};
        Afisha[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

}