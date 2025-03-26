package ua.nix.autoMation.ControlConstructs.cyrcles_for;
//Write a program that counts down from 30 to 0,
// and at the end displays the text "Boom!".

public class For_task_18 {
    public static void main(String[] args) {

        for (int i = 30; i >= 0; i--) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);

        }
        System.out.println("Boom!");
    }
}

