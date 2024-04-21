package e.commerce;
import java.util.Scanner;
public class ECommerceSystem {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        
        ElectronicProduct E1=new ElectronicProduct();
        ElectronicProduct E2=new ElectronicProduct();
        BookProduct B1=new BookProduct();
        ClothingProduct C1=new ClothingProduct();
        ClothingProduct C2=new ClothingProduct();
        
        E1.setName("Samsung Smartphone");
        E1.setProductID(1);
        E1.setPrice(599.9);
        E1.setBrand("Samsung");
        E1.setWarrantyPeriod(1);
        
        E2.setName("iphone");
        E2.setProductID(4);
        E2.setPrice(999.9);
        E2.setBrand("Apple" );
        E2.setWarrantyPeriod(1);
        
        B1.setName("OOP Book");
        B1.setProductID(3);
        B1.setPrice(39.99);
        B1.setAuthor("O'Reilly");
        B1.setPublisher("X Publications");
        
        C1.setName("T-shirt");
        C1.setProductID(2);
        C1.setPrice(19.99);
        C1.setFabric("Cotton");
        C1.setSize("Medium");
        
        C2.setName("Jacket");
        C2.setProductID(5);
        C2.setPrice(59.99);
        C2.setFabric("Wool");
        C2.setSize("Large");
        
        
        
        Customer cust=new Customer();
        System.out.println("Welcome to the E-Commerce System!");
        System.out.println("Please Enter your ID");
        cust.setCustomerID(user.nextInt());
        System.out.println("Please Enter your Name");
        cust.setName(user.nextLine());
        cust.setName(user.nextLine());
        System.out.println("Please Enter your Address");
        cust.setAddress(user.nextLine());
        System.out.println("Hello " +cust.getName());
        System.out.println("");
        System.out.println("");
        System.out.println("How many products you want to add to your cart");
        int NumOfProds =user.nextInt();
        Cart cart1 = new Cart(cust.getCustomerID(), NumOfProds);
        int i =0;
        while (i<cart1.getProducts().length){
            System.out.println("");
            System.out.println("");
            System.out.println("Which product would you like to add?");
            System.out.println("1- "+E1.getName()+" Price: "+E1.getPrice()+"$");
            System.out.println("2- "+E2.getName()+" Price: "+E2.getPrice()+"$");
            System.out.println("3- "+B1.getName()+" Price: "+B1.getPrice()+"$");
            System.out.println("4- "+C1.getName()+" Price: "+C1.getPrice()+"$");
            System.out.println("5- "+C2.getName()+" Price: "+C2.getPrice()+"$");
            int choice = user.nextInt();
            switch (choice){
                case 1 :
                    cart1.addProduct(E1, i);
                    i++;
                    break;
                case 2 :
                    cart1.addProduct(E2, i);
                    i++;
                    break;
                case 3 :
                    cart1.addProduct(B1, i);
                    i++;
                    break;
                case 4 :
                    cart1.addProduct(C1, i);
                    i++;
                    break;
                case 5 :
                    cart1.addProduct(C2, i);
                    i++;
                    break;
                default:
                    System.out.println("Invaild input");
                    break;
            }
        }
        boolean info = cart1.placeOrder();
        if (info ==true){
            Order order =new Order(cust.getCustomerID(), 100, cart1.getProducts(),cart1.calculatePrice());
            order.PrintOrderInfo();
        }
    }

}
