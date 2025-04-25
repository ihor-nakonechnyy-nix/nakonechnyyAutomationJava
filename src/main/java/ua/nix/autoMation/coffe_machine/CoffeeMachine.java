package ua.nix.autoMation.coffe_machine;


public class CoffeeMachine {

    private int water;
    private int milk;
    private int beans;

    public CoffeeMachine(int water, int milk, int coffee_beans) {
        this.water = water;
        this.milk = milk;
        this.beans = coffee_beans;

    }

    public void addSupplies() {
        this.water += 10000;
        this.milk += 10000;
        this.beans += 1000;
    }

    public void showSupplies() {
        System.out.println("Available Water: " + water + " ml");
        System.out.println("Available Milk: " + milk + " ml");
        System.out.println("Available Coffee beans: " + beans + " gr");
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

    public void ingredientsRequiredForOrderCompleted(int customerOrder) {
        water = this.water - customerOrder * 200;
        milk = this.milk - customerOrder * 50;
        beans = this.beans - customerOrder * 15;

    }

    public void coffeePrepared(int customerOrder) {
        int waterNeed = 200 * customerOrder;
        int milkNeed = 50 * customerOrder;
        int beansNeed = 15 * customerOrder;

        if (waterNeed <= this.water && milkNeed <= this.milk && beansNeed <= this.beans)
                System.out.println("Yes, I can make that amount of coffee. \nYour order of: " + customerOrder + " is preparing");
        else if (waterNeed >= this.water && milkNeed >= this.milk && beansNeed >= this.beans) {
            System.out.println("Not enough inridients to prepare : " + customerOrder + " cups of coffee");

            if (waterNeed >= this.water) ;
            System.out.println("Refile the water container");
            if (milkNeed >= this.milk) ;
            System.out.println("Refile the milk container");
            if (beansNeed >= this.beans) ;
            System.out.println("Add coffee beans");


        }
    }


}