package nakonechnyy.task1;
import java.util.Scanner;


 class Main {

     public static void main (String[] args ) {
        System.out.println("Hello World");
         printHelloName();
     }

     public static void printHelloName() {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter your name: ");
         String name = scanner.nextLine();
         System.out.println("Hello, " + name + "!");
         scanner.close();
     }
 }