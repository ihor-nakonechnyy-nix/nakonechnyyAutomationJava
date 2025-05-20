package ua.nix.autoMation.collections.tasks;

import java.util.HashMap;
import java.util.Map;

public class Task_4 {
    public static void main(String[] args) {

        Map<String, String> fruitmap = new HashMap<>();

        fruitmap.put("watermelon", "berry");
        fruitmap.put("banana", "grass");
        fruitmap.put("cherry", "berry");
        fruitmap.put("pear", "fruit");
        fruitmap.put("melon", "vegetable");
        fruitmap.put("blackberry", "bush");
        fruitmap.put("ginseng", "root");
        fruitmap.put("strawberry", "berry");
        fruitmap.put("iris", "flower");
        fruitmap.put("potato", "tuber");

        System.out.println("================");

        for (var entry : fruitmap.entrySet()) {

            System.out.println(" Key: " + entry.getKey());
            //System.out.println(" Value: " + entry.getValue());


        }
    }
}
