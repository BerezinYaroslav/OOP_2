package ru.cs.vsu.berezin_y_a.logic;

import ru.cs.vsu.berezin_y_a.clint.Person;

public class ConnectionLogic {

    public String connectPeople(Person person1, Person person2) {
        if (person1.equals(person2)) return "Человеку нужен ДРУГОЙ человек...";
        if (person1.getGender().equals(person2.getGender())) return "Однополые браки в нашей стране запрещены!";
        return "Найс коннект!";
    }
}
