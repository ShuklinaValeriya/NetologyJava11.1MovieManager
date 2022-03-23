package ru.netology.manager;

import ru.netology.domain.Afisha;

public class MovieManager {
    private int movieCount;
    private Afisha[] items = new Afisha[0];

    public MovieManager(int movieCount) {
        this.movieCount = movieCount;
    }

    public MovieManager() {
        this.movieCount = 10;
    }

    public void addMovie(Afisha item) {
        int length = items.length + 1;
        Afisha[] tmp = new Afisha[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Afisha[] findLast() {
        int resultLength; // длинна нового массива (списка для вывода фильмов)

        if (movieCount < items.length) {
            resultLength = movieCount;
        } else {
            resultLength = items.length;
        }

        Afisha[] result = new Afisha[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;

    }
}
