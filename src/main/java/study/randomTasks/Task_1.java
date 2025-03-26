package study.randomTasks;
import java.util.Scanner;

//1. Проста арифметика

public class Task_1 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.print("Введіть ціле число: ");
        int num_1 = scann.nextInt();

        System.out.print("Введіть ціле число: ");
        int num_2 = scann.nextInt();

        System.out.println(num_1 + num_2);
        System.out.println(num_1 - num_2);
        System.out.println(num_1 * num_2);
        System.out.println(num_1 / num_2);


    }
}
