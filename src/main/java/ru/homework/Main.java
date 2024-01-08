package ru.homework;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Person scientist = new Person("Albert", "Einstein", 76);
        Gson gson = new Gson();
        String jsonPersonSerialized = gson.toJson(scientist);

        Person personDeserialized = gson.fromJson(jsonPersonSerialized, Person.class);
        System.out.println(personDeserialized);
    }
}
