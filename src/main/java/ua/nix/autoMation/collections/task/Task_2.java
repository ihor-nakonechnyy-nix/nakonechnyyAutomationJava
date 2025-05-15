package ua.nix.autoMation.collections.task;

import java.util.HashMap;
import java.util.Map;

public class Task_2 {
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

        for (Map.Entry<String, String> pair : fruitmap.entrySet()) {

            String key = pair.getKey(); //ключ
            String value = pair.getValue(); //значение
            System.out.println(key + " - " + value);


        }
    }
}
