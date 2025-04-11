package ua.nix.autoMation.coffe_machine;


public class coffeMachineClass {

    private int water;
    private int milk;
    private int coffee_beans;

    public coffeMachineClass(int water, int milk, int coffee_beans) {
        this.water = water;
        this.milk = milk;
        this.coffee_beans = coffee_beans;


    }

    public int[] ingridientsAmountCalculation() {
        int water = this.water * 25;
        int milk = this.milk * 25;
        int coffee_beans = this.coffee_beans * 25;

        return new int[]{water, milk, coffee_beans};
    }

    public int[] ingridientsAmountPrint() {
        System.out.println("Water: " + water + " ml");
        System.out.println("Milk: " + milk + " ml");
        System.out.println("coffee beans: " + coffee_beans + " g");
        return new int[]{water, milk, coffee_beans};
    }


}


