package ua.nix.autoMation.Control_constructs_conditional_operators_andl_oops_Practical_task;


import java.util.Random;
import java.util.Scanner;

public class Tasks_on_conditional_operators {
    public static void main(String[] args) {
        //conditional_operators_task_1();
        //conditional_operators_task_2();
        //conditional_operators_task_3();
        //conditional_operators_task_4();
        //conditional_operators_task_5();
        //conditional_operators_task_6();
        //conditional_operators_task_7();
        conditional_operators_task_7_ForLoop();


    }

    public static void conditional_operators_task_1() {
        Scanner scann = new Scanner(System.in);
        System.out.print("enter first number: ");
        int num1 = scann.nextInt();

        System.out.print("enter second number: ");
        int num2 = scann.nextInt();

        if (num1 > num2) System.out.println(num2);
        else System.out.println(num1);

    }

    public static void conditional_operators_task_2() {
        Scanner scann = new Scanner(System.in);
        System.out.print("enter first number: ");
        int num1 = scann.nextInt();

        System.out.print("enter second number: ");
        int num2 = scann.nextInt();

        System.out.print("enter third number: ");
        int num3 = scann.nextInt();

        System.out.print("enter forth number: ");
        int num4 = scann.nextInt();

        if (num1 >= num2 && num1 >= num3 && num1 >= num4) System.out.println(num1);
        else if (num2 >= num1 && num2 >= num3 && num2 >= num4) System.out.println(num2);
        else if (num3 >= num1 && num3 >= num2 && num3 >= num4) System.out.println(num3);
        else System.out.println(num4);


    }

    public static void conditional_operators_task_3() {
        Scanner scann = new Scanner(System.in);

        int num1, num2, num3;
        System.out.print("enter first num: ");
        num1 = scann.nextInt();

        System.out.print("enter second num: ");
        num2 = scann.nextInt();

        System.out.print("enter third num: ");
        num3 = scann.nextInt();

        int num0;

        if (num1 < num2) {
            num0 = num1;
            num1 = num2;
            num2 = num0;
        }

        if (num1 < num3) {
            num0 = num1;
            num1 = num3;
            num3 = num0;
        }


        if (num2 < num3) {
            num0 = num2;
            num2 = num3;
            num3 = num0;
        }

        System.out.println("numbers in descending order:");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);


    }

    public static void conditional_operators_task_4() {
        Scanner scann = new Scanner(System.in);

        String name1, name2;

        System.out.print("enter first name: ");
        name1 = scann.nextLine();

        System.out.print("enter second name: ");
        name2 = scann.nextLine();


        if (name1.equals(name2)) {
            System.out.println("The names are identical");
        } else if (name1.length() == name2.length()) {
            System.out.println("The lengths of the names are equal");
        }
    }

    public static void conditional_operators_task_5() {
        Scanner scann = new Scanner(System.in);

        String name;
        int age;

        System.out.print("enter name: ");
        name = scann.nextLine();

        System.out.print("enter age: ");
        age = scann.nextInt();

        if (age < 18) System.out.println("Grow up more");


    }

    public static void conditional_operators_task_6() {
        Scanner scann = new Scanner(System.in);

        String name;
        int age;

        System.out.print("enter name: ");
        name = scann.nextLine();

        System.out.print("enter age: ");
        age = scann.nextInt();

        if (age > 18) System.out.println("18 is enough");
    }

    public static void conditional_operators_task_7() {
        Scanner scann = new Scanner(System.in);
        Random random = new Random();
        int secret;
        secret = random.nextInt(20 + 1);
        int attempt;

        System.out.println("Guess number within seven attempts");
        System.out.println("do your first attempt: ");
        attempt = scann.nextInt();
        if (attempt < secret) System.out.println("Little");
        else if (attempt > secret) System.out.println("Much");
        else {
            System.out.println("Guessed :)");
            return;
        }

        System.out.println("do your second attempt: ");
        attempt = scann.nextInt();
        if (attempt < secret) System.out.println("Little");
        else if (attempt > secret) System.out.println("Much");
        else {
            System.out.println("Guessed :)");
            return;
        }


        System.out.println("do your third attempt: ");
        attempt = scann.nextInt();
        if (attempt < secret) System.out.println("Little");
        else if (attempt > secret) System.out.println("Much");
        else {
            System.out.println("Guessed :)");
            return;

        }

        System.out.println("do your forth attempt: ");
        attempt = scann.nextInt();
        if (attempt < secret) System.out.println("Little");
        else if (attempt > secret) System.out.println("Much");
        else {
            System.out.println("Guessed :)");
            return;
        }


        System.out.println("do your fifth attempt: ");
        attempt = scann.nextInt();
        if (attempt < secret) System.out.println("Little");
        else if (attempt > secret) System.out.println("Much");
        else {
            System.out.println("Guessed :)");
            return;
        }
        System.out.println("do your sixth attempt: ");
        attempt = scann.nextInt();
        if (attempt < secret) System.out.println("Little");
        else if (attempt > secret) System.out.println("Much");
        else {
            System.out.println("Guessed :)");
            return;
        }
        System.out.println("do your seventh attempt: ");
        attempt = scann.nextInt();
        if (attempt < secret) {
            System.out.println("Little");
        } else if (attempt > secret) {
            System.out.println("Much");
        } else {
            System.out.println("Guessed :)");
        }

        if (attempt != secret) System.out.println("Did not guess :(");


    }

    public static void conditional_operators_task_7_ForLoop() {
        Scanner scann = new Scanner(System.in);
        Random random = new Random();
        int secret;
        secret = random.nextInt(20 + 1);
        int attempt;
        boolean guessed = false;


        for (int i = 1; i <= 7; i++) {
            System.out.print("Attempt " + i + ": ");
            attempt = scann.nextInt();

            if (attempt < secret) {
                System.out.println("Little");
            } else if (attempt > secret) {
                System.out.println("Much");
            } else {
                System.out.println("Guessed");
                guessed = true;
                break;
            }


        }

        if (!guessed) {
            System.out.println("Did not guess :( The secret number was: " + secret);
        }


    }


}





