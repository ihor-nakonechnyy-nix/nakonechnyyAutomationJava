package ua.nix.autoMation.Control_constructs_conditional_operators_andl_oops_Practical_task;

import java.util.Scanner;

public class Tasks_on_circles_for {
    public static void main(String[] args) {
        //for_task_13();
        //for_task_14();
        //for_task_15();
        //for_task_16();
        //for_task_17();
        //for_task_18();


    }

    public static void for_task_13() {
        for (int i = 1; i <= 50; i++) {
            int res = i;
            System.out.println(res * 2);


        }


    }

    public static void for_task_14() {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter number: ");
        int m = scan.nextInt();


        for (int i = 1; i <= m; i++) {
            System.out.print("enter number: ");
            int n = scan.nextInt();
            System.out.println();

            for (int j = 1; i <= n; i++) {
                String str = "8888";

                System.out.println(str);


            }
        }
    }

    public static void for_task_15() {
        String eights = "8";

        for (int j = 0; j < 10; j++) {


            for (int i = 1; i < j; i++) {


                System.out.print(eights);
            }
            System.out.println();
        }
//        System.out.println();
//        for (int i = 1; i < 3; i++) {
//            System.out.print(eights);
//        }
//        System.out.println();
//        for (int i = 1; i < 4; i++) {
//            System.out.print(eights);
//        }
//        System.out.println();
//        for (int i = 1; i < 5; i++) {
//            System.out.print(eights);
//        }
//        System.out.println();
//        for (int i = 1; i < 6; i++) {
//            System.out.print(eights);
//        }
//        System.out.println();
//        for (int i = 1; i < 7; i++) {
//            System.out.print(eights);
//        }
//        System.out.println();
//        for (int i = 1; i < 8; i++) {
//            System.out.print(eights);
//        }
//        System.out.println();
//        for (int i = 1; i < 9; i++) {
//            System.out.print(eights);
//        }
//        System.out.println();
//        for (int i = 1; i < 10; i++) {
//            System.out.print(eights);
//        }
//        System.out.println();
//        for (int i = 1; i < 11; i++) {
//            System.out.print(eights);


    }

    public static void for_task_16() {

        String eight = "8";

        for (int i = 0; i < 10; i++) {
            System.out.println(eight);

        }

        for (int j = 0; j < 10; j++) {
            System.out.print(eight + " ");


        }
    }

    public static void for_task_17() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter  name: ");
        String name = scan.nextLine();

        for (int i = 30; i >= 0; i++) ;
        {
            System.out.println(name + " loves me");
        }

    }

    public static void for_task_18() {

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
