package ru.cs.vsu.berezin_y_a.logic;

import ru.cs.vsu.berezin_y_a.clint.Gender;
import ru.cs.vsu.berezin_y_a.clint.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager implements Managers {
    public List<Person> personList = new ArrayList<>();

    @Override
    public void printMenu() {
        System.out.println("Выбери, что хотел бы сделать?");
        System.out.println("1 - Просмотреть свой профиль");
        System.out.println("2 - Изменить свой профиль");
        System.out.println("3 - Посмотреть рекомендации");
        System.out.println("4 - Проверить, подходит ли мне человек");
        System.out.println("5 - Посмотреть историю просмотра");
        System.out.println("6 - Добавить человека");
        System.out.println("0 - Выйти");
    }

    @Override
    public List<Person> getRecommendations(Person me) {
        List<Person> recommendList = new ArrayList<>();

        for (Person person : recommendList) {
            boolean isOK = person.getGender() != me.getGender(); // будет дополняться

            if (isOK) {
                recommendList.add(person);
            }
        }

        if (recommendList.size() == 0) {
            System.out.println("Тебе никто не подошел...");
        }

        return recommendList;
    }

    @Override
    public String connectPeople(Person person1, Person person2) {
        if (person1.equals(person2)) return "Человеку нужен ДРУГОЙ человек...";
        if (person1.getGender().equals(person2.getGender())) return "Однополые браки в нашей стране запрещены!";
        return "Найс коннект!";
    }

    @Override
    public void connectMeWithSomebody(Scanner scanner, Person me) {
        System.out.print("Введите id человека: ");
        int id = scanner.nextInt();

        for (Person person : personList) {
            if (person.getId() == id) {
                connectPeople(me, person);
                break;
            }
        }

        System.out.println("Человека с указанным id нет");
    }

    @Override
    public Person inputPersonData() {
        Scanner scanner = new Scanner(System.in);
        final String[] interests;

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
