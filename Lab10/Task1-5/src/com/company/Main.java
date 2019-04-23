package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog("owczarek australijski", "czarny", 17, 0.45, "Burek");
        Dog dog2 = new Dog("york", "bialy", 2.7, 0.2, "Ruffi");
        Dog dog3 = new Dog("owczarek niemiecki", "czarny", 31, 0.5, "Kafar");
        Dog dog4 = new Dog("husky", "bialy", 27, 0.4, "Alex");
        Dog dog5 = new Dog("buldog francuski", "szary", 5.6, 0.22, "Garek");
        Dog dog6 = dog5;
        Dog dog7 = new Dog("bokser", "kasztanowy", 10, 0.3, "Sonya");

        List<Dog> dogList = new ArrayList<>();
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
        dogList.add(dog4);
        dogList.add(dog5);
        dogList.add(dog6);
        dogList.add(dog7);

        // Zad.1
        dogList.stream()
                .filter(e -> e.getColor().equals("czarny"))
                .filter(e -> e.getWeight() >= 10)
                .forEach(System.out::println);
        System.out.println();

        // Zad.2
        System.out.println(dogList.stream()
                .filter(e -> e.getBreed().contains("owczarek"))
                .count());
        System.out.println();

        // Zad.3
        List<Dog> smallDogList = dogList.stream()
                                    .filter(e -> e.getWeight() < 15)
                                    .filter(e -> e.getHeight() < 0.4)
                                    .collect(Collectors.toList());
        smallDogList.forEach(System.out::println);
        System.out.println();

        // Zad.4
        Map<String, Dog> dogMap = dogList.stream()
                .distinct()
                .collect(Collectors.toMap(Dog::getName, dog -> dog));
        System.out.println(dogMap);
        System.out.println();

        // Zad.5
        System.out.println(dogList.stream()
                .anyMatch(e -> e.getWeight() == 10.0));
    }
}
