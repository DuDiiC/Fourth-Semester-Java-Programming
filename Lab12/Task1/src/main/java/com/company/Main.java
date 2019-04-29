package com.company;

import org.json.JSONObject;

public class Main {

    public static void main(String[] args) {

        JSONObject person = new JSONObject();
        person.put("name", "Kate");
        person.put("surname", "Gadovsky");
        person.put("birth day", "98/03/23");

        JSONObject address = new JSONObject();
        address.put("street", "Down Street Jr.");
        address.put("house", 13);
        address.put("post code", "122-344");
        address.put("city", "NY");

        person.put("address", address);

        System.out.println(person.toString());
        System.out.println();

        String name = person.optString("name");
        String surname = person.optString("surname");
        String birthDay = person.optString("birth day");

        JSONObject addressObj = person.optJSONObject("address");

        String street = addressObj.optString("street");
        int house = addressObj.optInt("house");
        String postCode = addressObj.optString("post code");
        String city = addressObj.optString("city");

        System.out.println(name + surname + "\n"
                + birthDay + "\n"
                + street + " " + house + "\n"
                + postCode + " " + city);
    }
}
