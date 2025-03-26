package study.myTasks;

public class Basics3 {
    public static void main(String[] args) {

        int age = 15;

        if (age >= 18) {
            System.out.println("you can vote");
            System.out.println("please put an X in the ballot");
        } else {
            System.out.println("you cannot vote;\n Please come in " + (18 - age) + " years");
        }

    }
}
