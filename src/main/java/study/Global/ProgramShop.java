package study.Global;

public class ProgramShop {
    public static void main(String[] args) {

        Product p1 = new Product("Banana", 1, 40);
        Product p2 = new Product("apple", 0.5, 20);
//        Product p2 = new Product("Apple");
//        System.out.println(p1);
//        System.out.println(p2);
//        Currency.usd = 36.5;
//        System.out.println(p1);
//        System.out.println(p2);
        p1.printName();
        p2.printName();

        p1.setName("Orange");
        p1.printName();


    }

}
