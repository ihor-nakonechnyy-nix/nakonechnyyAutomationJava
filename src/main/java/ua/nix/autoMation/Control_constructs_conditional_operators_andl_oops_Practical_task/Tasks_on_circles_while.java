package ua.nix.autoMation.Control_constructs_conditional_operators_andl_oops_Practical_task;

import java.util.Scanner;

public class Tasks_on_circles_while {
    public static void main(String[] args) {
        //while_task_8();
        //while_task_9();
        while_task_10();
        //while_task_11();
        //while_task_12();


    }

    public static void while_task_8() {


        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;

        }
    }

    public static void while_task_9() {


        int i = 10;
        while (i >= 0) {
            System.out.println(i);
            i--;

        }
    }

    public static void while_task_10() {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter string: ");
        String str = scan.nextLine();
        System.out.print("enter number: ");
        int num = scan.nextInt();

        int i = 0;
        while (i < num) {
            System.out.println(str);
            i++;

        }
    }

    public static void while_task_11() {
        int row = 0;

        while (row < 10) {
            int coll = 0;

            while (coll < 10) {
                System.out.print("S");
                coll++;
            }
            System.out.println();
            row++;

        }
    }

    public static void while_task_12() {
        int i = 1;

        while (i <= 3) {
            int j = 0;

            while (j <= 10) {
                System.out.print(i * j + " ");

                j++;


            }
            i++;
            System.out.println();

        }


    }
}




