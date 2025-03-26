package ua.nix.autoMation.typeConversions;

/*
Given three variables a, b and c.
Change the values of these variables so that
a stores the value of a+b, b stores the difference of
the old values of c-a, and c stores the sum of the old values of a+b+c.
For example, a=0, b=2, c=5, then the new values are a=2, b=5 and c=7.
*/

public class Auto4 {

    public static void main(String[] args) {
        int a = 0;
        int b = 2;
        int c = 5;

        int a2 = a;
        int b2 = b;
        int c2 = c;

        a = a + b;
        b = c2 - a2;
        c = a2 + b2 + c2;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }

}







