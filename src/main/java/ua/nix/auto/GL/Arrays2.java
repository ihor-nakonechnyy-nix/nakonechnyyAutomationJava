package ua.nix.auto.GL;

public class Arrays2 {
    public static void print100() {
        int i = 0;
        while (i <= 100) {
            System.out.println(i);
            i = i + 1;
        }

    }

    public static void printDecrement(int start, int stop) {
        int i = start;
        while (i >= stop) {
            System.out.println(i);
            i--;
        }
    }

    public static void main(String[] args) {
        //print100();
        printDecrement(200, 10);
        printDecrement(30, -10);
        printDecrement(10, -5);


    }
}
