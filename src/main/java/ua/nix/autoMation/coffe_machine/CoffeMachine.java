package ua.nix.autoMation.coffe_machine;


public class CoffeMachine {

    public int water;
    public int milk;
    public int coffee_beans;

    public CoffeMachine(int water, int milk, int coffee_beans) {
        this.water = water;
        this.milk = milk;
        this.coffee_beans = coffee_beans;


    }

    public int[] getIngridAmount() {

        int water = this.water * 25;
        int milk = this.milk * 25;
        int coffee_beans = this.coffee_beans * 25;

        System.out.println("Water: " + water + " ml");
        System.out.println("Milk: " + milk + " ml");
        System.out.println("coffee beans: " + coffee_beans + " g");

        return new int[]{water, milk, coffee_beans};
    }
}

