package ua.nix.autoMation.collections.task_3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Cat> cats = new HashMap<>();

        cats.put("Barsik", new Cat("Barsik"));
        cats.put("Murka", new Cat("Murka"));
        cats.put("Leopold", new Cat("Leopold"));
        cats.put("Simba", new Cat("Simba"));
        cats.put("Tom", new Cat("Tom"));
        cats.put("Luna", new Cat("Luna"));
        cats.put("Garfield", new Cat("Garfield"));
        cats.put("Whiskers", new Cat("Whiskers"));
        cats.put("Felix", new Cat("Felix"));
        cats.put("Bella", new Cat("Bella"));


        for (String catList : cats.keySet()) {
            System.out.println(catList);
        }

    }


}