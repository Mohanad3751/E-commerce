package e.commerce;
public class Product {
    protected int productID;
    protected String name;
    protected double price;

    public void setProductID(int productID) {
        this.productID = Math.abs(productID);
    }
    
    public int getProductID() {
        return productID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = Math.abs(price);
    }

    public double getPrice() {
        return price;
    }
}