package study.randomTasks;
import java.util.Scanner;

//2. Перевірка парності

public class Task_2 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.print("Введіть ціле число: ");
        int num = scann.nextInt();

        if(num % 2 == 0){
            System.out.println("Число є парним.");
        } else {
            System.out.println("Число є непарним.");
        }
    }
}
