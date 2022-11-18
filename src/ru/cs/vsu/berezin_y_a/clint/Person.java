package ru.cs.vsu.berezin_y_a.clint;

import java.util.Arrays;
import java.util.Objects;

public class Person {
    public static int id = 0;
    public final String firstName;
    public final String lustName;
    public final Integer age;
    public final Gender gender;
    public String[] interests;

    public Person(String firstName, String lustName, Integer age, Gender gender) {
        ++id;
        this.firstName = firstName;
        this.lustName = lustName;
        this.age = age;
        this.gender = gender;
    }

    public Person(String firstName, String lustName, Integer age, Gender gender, String[] interests) {
        this.firstName = firstName;
        this.lustName = lustName;
        this.age = age;
        this.gender = gender;
        this.interests = interests;
    }

    public String getProfileCard() {
        String profile = firstName + " " + lustName + ", " + age + ", " + gender;

        if (this.interests != null) {
            profile += ", интересы: " + Arrays.toString(interests);
        }

        return profile;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != getClass()) return false;

        Person person = (Person) obj;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lustName, person.lustName) &&
                Objects.equals(age, person.age) &&
                Objects.equals(gender, person.gender) &&
                Arrays.equals(interests, person.interests);
    }

    @Override
    public int hashCode() {
        int hash = 17;

        if (firstName != null) {
            hash += firstName.hashCode();
        }
        hash *= 31;

        if (lustName != null) {
            hash += lustName.hashCode();
        }
        hash *= 31;

        if (age != null) {
            hash += age.hashCode();
        }
        hash *= 31;

        if (gender != null) {
            hash += gender.hashCode();
        }
        hash *= 31;

        if (interests != null) {
            hash += Arrays.hashCode(interests);
        }
        hash *= 31;

        return hash;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                "firstName='" + firstName + '\'' +
                ", lustName='" + lustName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", interests=" + Arrays.toString(interests) +
                '}';
    }
}
