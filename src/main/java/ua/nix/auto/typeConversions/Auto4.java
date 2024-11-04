package ua.nix.auto.typeConversions;

/*
Given three variables a, b and c.
Change the values of these variables so that
a stores the value of a+b, b stores the difference of
the old values of c-a, and c stores the sum of the old values of a+b+c.
For example, a=0, b=2, c=5, then the new values are a=2, b=5 and c=7.
*/

public class Auto4 {

    public static void main(String[] args) {


        int a = 1001;
        int b = 5565;
        int c = 9865;

        a = a + b;
        b = c - a;
        c = a + b + c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }

}







