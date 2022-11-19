package ru.cs.vsu.berezin_y_a.logic;

import ru.cs.vsu.berezin_y_a.clint.Person;

import java.util.List;

public interface Managers {

    void printMenu();

    Person inputMyData();

    List<Person> getRecommendations();
}
