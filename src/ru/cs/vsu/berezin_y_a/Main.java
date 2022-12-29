package ru.cs.vsu.berezin_y_a;

import ru.cs.vsu.berezin_y_a.clint.Person;
import ru.cs.vsu.berezin_y_a.logic.Manager;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);
        int command;
        Person me;

        System.out.println("Привет! Ты попал в консольный Badoo!");
        me = manager.inputPersonData();

        while (true) {
            manager.printMenu();
            command = scanner.nextInt();

            switch (command) {
                case 1 -> System.out.println(me.getProfileCard());
                case 2 -> {
                    System.out.println("Введи информацию о себе:");
                    me = manager.inputPersonData();
                }
                case 3 -> {
                    for (Person person : manager.getRecommendations(me)) {
                        System.out.println(person.getProfileCard());
                    }
                }
                case 4 -> manager.connectMeWithSomebody(scanner, me);
                case 5 -> manager.addPerson(manager.inputPersonData());
                case 0 -> {
                    return;
                }
                default -> System.out.println("Нет такой команды, попробуйте еще раз");
            }
        }
    }
}
