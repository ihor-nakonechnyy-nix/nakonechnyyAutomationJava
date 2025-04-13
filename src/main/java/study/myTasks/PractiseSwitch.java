package study.myTasks;

import java.util.Random;
import java.util.Scanner;

public class PractiseSwitch {
    public static void main(String[] args) {
        swich1();
    }

    public static void swich1() {
        Scanner scann = new Scanner(System.in);
        System.out.println("Ented a week day by number from 1-7: ");
        int day = scann.nextInt();

        switch (day) {
            case 1:
                System.out.println("Понеділок");
                break;
            case 2:
                System.out.println("Вівторок");
                break;
            case 3:
                System.out.println("Середа");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятниця");
                break;
            case 6:
                System.out.println("Субота");
                break;
            case 7:
                System.out.println("Неділя");
                break;


        }
    }

    public static void whileTask7() {
        Random random = new Random();
        int secret;
        secret = random.nextInt(20 + 1);



    }
}

