package selenium.saucedemo;

public class Product {

    public String productName;
    public double productPrice;
    public String productDescription;
    public int itemsInCart;

    public Product(String productName, double productPrice, String productDescription, int itemsInCart) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
        this.itemsInCart = itemsInCart;
    }


}
