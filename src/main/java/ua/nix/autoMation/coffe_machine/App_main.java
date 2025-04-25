package ua.nix.autoMation.coffe_machine;

import java.util.Scanner;

public class App_main {
    public static void main(String[] args) {

        //create object coffeeMachine of CoffeeMachine class
        //No ingredients added
        CoffeeMachine coffeeMachine = new CoffeeMachine(0, 0, 0);


        System.out.println();  //paragraph
        System.out.println("Add ingredients to the coffee machine");

        //Use addSupplies method to add the ingredients to the coffee machine
        coffeeMachine.addSupplies();
        //Use showSupplies method to show how much ingredients in the coffee machine
        System.out.println("Show supplies left in the coffee machine");
        coffeeMachine.showSupplies();

        System.out.println();  //paragraph

        //User order coffee cups quantity
        System.out.print("Order coffee cups: ");
        Scanner scanner = new Scanner(System.in);
        int customerOrder = scanner.nextInt();

        System.out.println();  //paragraph
        System.out.println("Here is ingredients amount required for " + customerOrder + " cup(s) of coffee");
        coffeeMachine.ingredientsAmountPrint(customerOrder);

        System.out.println();  //paragraph
        //Shows supplies left after the order done
        System.out.println("Shows ingredients after the order of: " + customerOrder + " cups is prepared");
        coffeeMachine.ingredientsAfterOrderCompleted(customerOrder);
        coffeeMachine.showSupplies();

        if (customerOrder*)






    }


}



