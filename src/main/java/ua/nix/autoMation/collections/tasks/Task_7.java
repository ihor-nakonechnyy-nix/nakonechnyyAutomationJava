package ua.nix.autoMation.collections.tasks;

import java.util.ArrayList;
import java.util.Set;

public class Task_7 {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("watermelon");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("pear");
        fruits.add("melon");
        fruits.add("blackberry");
        fruits.add("ginseng");
        fruits.add("strawberry");
        fruits.add("iris");
        fruits.add("potato");

        System.out.println("================");

        System.out.println("Size: " + fruits.size());
        System.out.println("================");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }


    }
}
