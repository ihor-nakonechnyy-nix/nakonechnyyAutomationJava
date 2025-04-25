package ua.nix.autoMation.coffe_machine;


public class CoffeeMachine {

    private int water;
    private int milk;
    private int coffee_beans;

    public CoffeeMachine(int water, int milk, int coffee_beans) {
        this.water = water;
        this.milk = milk;
        this.coffee_beans = coffee_beans;

    }

    public void addSupplies() {
        this.water += 10000;
        this.milk += 10000;
        this.coffee_beans += 1000;
    }

    public void showSupplies() {
        System.out.println("Available Water: " + water + " ml");
        System.out.println("Available Milk: " + milk + " ml");
        System.out.println("Available Coffee beans: " + coffee_beans + " gr");
    }

    private int[] ingredientsCalculation(int customerOrder) {
        int water = 200 * customerOrder;
        int milk = 50 * customerOrder;
        int coffee_beans = 15 * customerOrder;
        return new int[]{water, milk, coffee_beans};
    }

    public void ingredientsAmountPrint(int customerOrder) {
        int[] ingredients = ingredientsCalculation(customerOrder);

        System.out.println("Water: " + ingredients[0] + " ml");
        System.out.println("Milk: " + ingredients[1] + " ml");
        System.out.println("coffee beans: " + ingredients[2] + " gr");


    }

    public void ingredientsAfterOrderCompleted(int customerOrder) {
        water = this.water - customerOrder * 200;
        milk = this.milk - customerOrder * 50;
        coffee_beans = this.coffee_beans - customerOrder * 15;

    }
}