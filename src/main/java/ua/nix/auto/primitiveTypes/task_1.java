package ua.nix.auto.primitiveTypes;


import java.util.Scanner;


class task_1 {

    public static void main(String[] args) {
        System.out.println("Hello World");
        printHelloName();
    }

    public static void printHelloName() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "!");
        scan.close();
    }
}