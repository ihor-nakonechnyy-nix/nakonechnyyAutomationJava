package ua.nix.autoMation.collections.tasks;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class task_1 {
    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();

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


        for (String fruit : fruits) {
            System.out.println(fruit);
        }

//      Iterator<String> fruitsIterator = fruits.iterator();
//      while (fruitsIterator.hasNext()) {
//          String fruitsList = fruitsIterator.next();
//            System.out.println(fruitsList);
//        }


    }


}
