package ru.cs.vsu.berezin_y_a.logic;

import ru.cs.vsu.berezin_y_a.clint.Person;

public class ConnectionLogic {
    public String connectPeople(Person person1, Person person2) {
        if (person1.equals(person2)) return "Человеку нужен ДРУГОЙ человек...";
        if (person1.gender.equals(person2.gender)) return "Однополые браки в нашей стране запрещены!";
        return "Найс коннект!";
    }
}
