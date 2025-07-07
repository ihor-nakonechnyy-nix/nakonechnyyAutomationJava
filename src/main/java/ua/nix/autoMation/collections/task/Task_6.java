    package ua.nix.autoMation.collections.task;

    import java.util.HashMap;
    import java.util.Map;

    public class Task_6 {
        public static void main(String[] args) {

            Map<String, Object> fruitmap = new HashMap<>();

            fruitmap.put("Object 1", 12);
            fruitmap.put("Object 2", 12.5);
            fruitmap.put("Object 3", true);
            fruitmap.put("Object 4", false);
            fruitmap.put("Object 5", "g");
            fruitmap.put("Object 6", "$");
            fruitmap.put("Object 7", 100500);
            fruitmap.put("Object 8", 100000);
            fruitmap.put("Object 9", 125.555);
            fruitmap.put("Object 10", 15);

            System.out.println("================");

            for (var entry : fruitmap.entrySet()) {
                System.out.println(" Key: " + entry.getKey() + " - Value: " + entry.getValue());


            }
        }
    }
