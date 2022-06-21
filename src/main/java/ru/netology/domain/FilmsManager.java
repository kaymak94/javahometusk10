package ru.netology.domain;


import lombok.Data;


@Data
public class FilmsManager {



    private int defaultFilmsLimit = 10;
    private int needFilmsLimit;

    public FilmsList[] films = new FilmsList[0];




    public int add() {

        int length = films.length + 1;
        FilmsList[] tmp = new FilmsList[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        FilmsList film = null;
        tmp[lastIndex] = film;
        films = tmp;
        return length;
    }


    public void FilmsList[] findAll {
        return films;
    }

    public FilmsManager(int limitFilms) {
        this.needFilmsLimit = limitFilms;
    }

    public FilmsList[] findLast() {
        int needLength;
        if (this.needFilmsLimit == this.defaultFilmsLimit) {
            needLength = this.defaultFilmsLimit;
        } else {
            needLength = findAll().length;
        }
        FilmsList[] need = new FilmsList[needLength];
        for (int i = 0; i < need.length; i++) {
            int index = films.length - i - 1;
            need[i] = films[index];
        }
        return need;
    }


}



