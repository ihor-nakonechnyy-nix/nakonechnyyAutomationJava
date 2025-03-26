package ua.nix.autoMation.ControlConstructs.cyrcles_While;

public class While_task_12 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 10) {
            int j = 1;
            while (j <= 10) {
                System.out.print(i * j + " ");
                j++;
            }
            System.out.println();
            i++;
        }


    }


}

