package study.Global;

public class Product {
    private String name;
    private double weight;
    private double price;

    public Product(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.setPrice(price);
    }

    public void printName(){

        System.out.println(name);

    }

    public Product(String name) {
//        this.name = name;
//        this.weight = 1;
//        this.price = 25;
        this(name, 1, 25);
    }

    public String getName() {
        return name;
    }

    public void setName(String hernya) {
        this.name = hernya;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 0) throw new IllegalArgumentException();
        this.weight = weight;
    }

    public double getPrice() {
        return this.price*Currency.usd;
    }

    public void setPrice(double price) {
        this.price = price/Currency.usd;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + getPrice() +
                '}';
    }
}

