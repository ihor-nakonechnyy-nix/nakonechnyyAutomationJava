package ua.nix.auto.referenceTypes.Strings;

import java.util.Scanner; // Імпорт класу Scanner для введення користувача

public class StringTask_1_1 {



        public static void main(String[] args) {
            // Створення об'єкта Scanner для зчитування введення користувача
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a positive number: ");
            int number = scanner.nextInt(); // Зчитування цілого числа від користувача

            // Перевірка, чи введене число є додатним
            if (number > 0) {
                int sum = 0; // Змінна для зберігання суми чисел

                // Цикл for для обчислення суми чисел від 1 до number
                for (int i = 1; i <= number; i++) {
                    sum += i; // Додаємо значення i до змінної sum
                }

                // Виведення результату
                System.out.println("The sum of numbers from 1 to " + number + " is: " + sum);
            } else {
                System.out.println("Please enter a positive number."); // Повідомлення про помилку
            }
        }
    }



