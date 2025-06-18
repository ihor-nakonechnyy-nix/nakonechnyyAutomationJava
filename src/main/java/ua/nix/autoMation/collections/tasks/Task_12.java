package ua.nix.autoMation.collections.tasks;


import java.util.Set;
import java.util.HashSet;

public class Task_12 {
    public static void main(String[] args) {

        Set<String> lWords = new HashSet<String>();

        lWords.add("1. Lemon");
        lWords.add("2. Light");
        lWords.add("3. Love");
        lWords.add("4. Lord");
        lWords.add("5. Line");
        lWords.add("6. Loyal");
        lWords.add("7. Label");
        lWords.add("8. Little");
        lWords.add("9. Language");
        lWords.add("10. Library");

        for (String lWordsLoop : lWords) {
            System.out.println(lWordsLoop);
        }
    }
}
