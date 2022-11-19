package ru.cs.vsu.berezin_y_a.logic;

import ru.cs.vsu.berezin_y_a.clint.Person;

import java.util.List;
import java.util.Scanner;

public interface Managers {
    void printMenu();

    Person inputPersonData();

    List<Person> getRecommendations(Person me);

    String connectPeople(Person person1, Person person2);

    void connectMeWithSomebody(Scanner scanner, Person me);
}
