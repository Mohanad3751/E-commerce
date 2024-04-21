package e.commerce;
public class Order {
    private int customerID;
    private int orderID;
    private Product [] products;
    private double totalprice;

    public Order(int customerID, int orderID, Product[] products, double totalprice) {
        this.customerID = customerID;
        this.orderID = orderID;
        this.products = products;
        this.totalprice = totalprice;
    }

    public Order() {
    }
    

    public void setCustomerID(int customerID) {
        this.customerID = Math.abs(customerID);
    }

    public void setOrderID(int orderID) {
        this.orderID = Math.abs(orderID);
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = Math.abs(totalprice);
    }
    public void PrintOrderInfo(){
        System.out.println("Here's your order's summary:");
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer ID: " +customerID);
        System.out.println("Products: ");
        for (int i =0; i<products.length;i++){
            System.out.println((i+1)+" - "+products[i].getName()+" $"+products[i].getPrice());    
        }
    }
}
