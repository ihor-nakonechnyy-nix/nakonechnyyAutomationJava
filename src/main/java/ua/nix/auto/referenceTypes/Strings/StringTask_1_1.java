package ua.nix.auto.referenceTypes.Strings;
import java.util.Scanner;

public class StringTask_1_1 {


        public static void main(String[] args) {
            // Створюємо сканер для читання введеного рядка
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a string of words separated by spaces:");
            // Зчитуємо весь введений рядок
            String input = scanner.nextLine();

            // Розбиваємо рядок на масив слів за пробілами
            String[] words = input.split(" ");

            // Змінна для зберігання найдовшого слова
            String longestWord = "";

            // Проходимо по всіх словах
            for (String word : words) {
                // Якщо довжина поточного слова більше довжини найдовшого слова, оновлюємо найдовше слово
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }

            // Виводимо найдовше слово
            System.out.println("The longest word is: " + longestWord);
        }
    }

