package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog("owczarek australijski", "czarny", 17, 0.45, "Burek");
        Dog dog2 = new Dog("york", "bialy", 2.7, 0.2, "Ruffi");
        Dog dog3 = new Dog("owczarek niemiecki", "czarny", 31, 0.5, "Kafar");
        Dog dog4 = new Dog("husky", "bialy", 27, 0.4, "Alex");
        Dog dog5 = new Dog("buldog francuski", "szary", 5.6, 0.22, "Garek");

        List<Dog> dogList = new ArrayList<>();
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
        dogList.add(dog4);
        dogList.add(dog5);

        List<Dog> smallDogList = new ArrayList<>();
        CatalogueDog catalogueSmallDog = d -> d.getHeight() < 0.3;

        for(Dog d : dogList) {
            if(catalogueSmallDog.checkBelong(d))
                smallDogList.add(d);
        }

        List<Dog> bigDogList = new ArrayList<>();
        CatalogueDog catalogueBigDog = d -> d.getHeight() > 0.4;

        for(Dog d : dogList) {
            if(catalogueBigDog.checkBelong(d))
                bigDogList.add(d);
        }

        List<Dog> blackDogList = new ArrayList<>();
        CatalogueDog catalogueBlackDog = d -> d.getColor().equals("czarny");

        for(Dog d : dogList) {
            if(catalogueBlackDog.checkBelong(d))
                blackDogList.add(d);
        }

        smallDogList.forEach(System.out::println);
        System.out.println();
        bigDogList.forEach(System.out::println);
        System.out.println();
        blackDogList.forEach(System.out::println);
    }
}
