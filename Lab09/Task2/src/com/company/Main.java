package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Adrian", "Kowalski", 31, "kowalski@wp.pl"));
        persons.add(new Person("Damian", "Pawlik", 21, "pawlik@wp.pl"));
        persons.add(new Person("Ania", "Surnicka", 45, "anka3@gmail.com"));
        persons.add(new Person("Karolina", "Etylska", 37, "epek.33@onet.pl"));
        persons.add(new Person("Michal", "Fik", 22, "kakaka@hotmail.com"));
        persons.add(new Person("Jakub", "Zawadzki", 11, "4231123@gmail.com"));
        persons.add(new Person("Dawid", "Agretar", 9, "dejvAger@poczta.onet.pl"));
        persons.add(new Person("Beata", "Nikke", 91, "beatabeatabeata@gmail.com"));

        persons.forEach(System.out::println);
        // or persons.forEach(person -> System.out.println(person));
        System.out.println();

        persons.sort(Comparator.comparing(Person::getName));
        // or persons.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
        persons.forEach(System.out::println);
        System.out.println();

        persons.sort(Comparator.comparing(Person::getSurname));
        persons.forEach(System.out::println);
        System.out.println();

        persons.sort(Comparator.comparing(Person::getAge));
        persons.forEach(System.out::println);
        System.out.println();

        persons.sort(Comparator.comparing(Person::getEmail));
        persons.forEach(System.out::println);
        System.out.println();
    }
}
