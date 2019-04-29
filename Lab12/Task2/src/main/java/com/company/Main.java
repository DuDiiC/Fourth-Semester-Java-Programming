package com.company;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Address address = new Address("Kossaka", 13, "54-443", "New York");
        Person person = new Person("Kate", "Gadovsky", "98/03/23", address);

        ObjectMapper objectMapper = new ObjectMapper();

        String JSONPerson = null;
        try {
            JSONPerson = objectMapper.writeValueAsString(person);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        System.out.println(JSONPerson);
        System.out.println();

        Person person2 = new Person();
        try {
            person2 = objectMapper.readValue(JSONPerson, Person.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(person2);
    }
}
