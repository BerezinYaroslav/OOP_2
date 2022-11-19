package ru.cs.vsu.berezin_y_a;

import ru.cs.vsu.berezin_y_a.clint.Person;
import ru.cs.vsu.berezin_y_a.logic.ConnectionLogic;
import ru.cs.vsu.berezin_y_a.logic.Manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);
        ConnectionLogic logic = new ConnectionLogic();
        List<Person> people = new ArrayList<>();
        int command;
        Person me;

        System.out.println("Привет! Ты попал в консольный Badoo!");
        me = manager.inputMyData();

        while (true) {
            manager.printMenu();
            command = scanner.nextInt();

            switch (command) {
                case 1 -> System.out.println(me.getProfileCard());
                case 2 -> me = manager.inputMyData();
                //case 3 -> ;
                //case 4 -> ;
                case 5 -> {

                }
                case 0 -> {
                    return;
                }
                default -> System.out.println("Нет такой команды, попробуйте еще раз");
            }
        }
    }
}
