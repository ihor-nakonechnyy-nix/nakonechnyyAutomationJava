package study.myTasks;

public class Basics2 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
        System.out.println((num1 + num2) * 4);

        int myNumber = 0;
        myNumber += 4;
        System.out.println(myNumber);
        myNumber -= 4;
        System.out.println(myNumber);
        myNumber *= 4;
        System.out.println(myNumber);
        myNumber /= 4;
        System.out.println(myNumber);
        myNumber %= 4;
        System.out.println(myNumber);

        int Mynumber = 1;


        System.out.println("prefix decrementation " + --Mynumber);
        System.out.println("postfix decrementation " + Mynumber--);

        System.out.println("postfix decrementation " + Mynumber++);
        System.out.println("prefix decrementation " + ++Mynumber);

    }

}
