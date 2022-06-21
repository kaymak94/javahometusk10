package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmsManagerTest {

    @Test
    public void FilmsListTest() {
        FilmsManager manager = new FilmsManager(0);
        int expected = 1;
        int actual = manager.add();
        assertEquals(expected, actual);


    }
public void FilmsListTestLast() {
        FilmsManager manager = new FilmsManager(0);
    FilmsList films = new FilmsList();
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);



}
}
