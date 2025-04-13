package study.myTasks;

import java.util.Scanner;

public class Practise_If {

    static public void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int a, b, c;

        System.out.println("Enter three number from keyboard: ");
        a = scann.nextInt();
        b = scann.nextInt();
        c = scann.nextInt();


        if (a < b) {
            if (a < c)
                System.out.println("a – це мінімум");
            else
                System.out.println("c – це мінімум");
        } else {
            if (b < c)
                System.out.println("b – це мінімум");
            else
                System.out.println("c – це мінімум");
        }
    }
}
