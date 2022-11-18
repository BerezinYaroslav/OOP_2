package ru.cs.vsu.berezin_y_a.logic;

import ru.cs.vsu.berezin_y_a.clint.Gender;
import ru.cs.vsu.berezin_y_a.clint.Person;

import java.util.Scanner;

public class Manager {
    public void printMenu() {
        System.out.println("Выбери, что хотел бы сделать?");
        System.out.println("1 - Просмотреть свой профиль");
        System.out.println("2 - Изменить свой профиль");
        System.out.println("3 - Посмотреть рекомендации");
        System.out.println("3 - Проверить, подходит ли мне человек");
        System.out.println("5 - Посмотреть историю просмотра");
        System.out.println("0 - Выйти");
    }

    public Person inputMyData() {
        Scanner scanner = new Scanner(System.in);
        final String[] interests;

        System.out.println("Введи информацию о себе:");

        System.out.print("Имя: ");
        String name = scanner.nextLine();

        System.out.print("Фамилия: ");
        String surname = scanner.nextLine();

        System.out.print("Возраст: ");
        int age = scanner.nextInt();

        System.out.print("Твой гендер (1 - мужчина, 2 - женщина): ");
        Gender gender;

        if (scanner.nextByte() == 1) {
            gender = Gender.MAN;
        } else {
            gender = Gender.WOMAN;
        }

        System.out.println("Хотите ввести интересы? (1 - да, 2 - нет): ");

        if (scanner.nextByte() == 1) {
            System.out.print("Введите их через запятую без пробелов: ");
            interests = scanner.next().split(",");
            return new Person(name, surname, age, gender, interests);
        }

        return new Person(name, surname, age, gender);
    }
}
