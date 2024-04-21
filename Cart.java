package e.commerce;
import java.util.Scanner;
public class Cart {
    Scanner user = new Scanner(System.in);
    private int customerID;
    private int nProducts;
    private Product [] products ;

    public Cart() {
    }
    
    public Cart(int customerID, int nProducts) {
        this.customerID = customerID;
        this.nProducts = Math.abs(nProducts);
        products =new Product[this.nProducts];
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = Math.abs(customerID);
    }

    public int getnProducts() {
        return nProducts;
    }

    public void setnProducts(int nProducts) {
        this.nProducts = Math.abs(nProducts);
    }

    public void addProduct(Product x,int a){
        if(a<nProducts){
        products[a]=x;    
        }
        else{
            Product [] add=new Product[a+1];
            for (int i=0;i<products.length;i++){
                add[i]=products[i];
            }
            add[a]=x;
            products =add;
            nProducts=products.length;
            
        }
    }

    public Product[] getProducts() {
        return products;
    }
    
    public void removeProduct(){
        System.out.println("which Product want you remove?");
        for (int i= 0;i<products.length;i++){
            System.out.println((i+1)+ " - " + products[i].getName());
        }
        int re = user.nextInt();
        if (re>products.length){
            System.out.println("invalid input");
        }
        Product [] N =new Product[products.length-1];
        for (int i = 0,pre =0;i<N.length; pre++){
            if (pre==(re-1)){
                continue;
            }
            N[i] = products[pre];
            i++;
            }
        products =N;
        nProducts--;
        
    }
    
    public double calculatePrice(){
        double finPrice=0;
        for (int i=0;i<products.length;i++){
            finPrice+=products[i].getPrice();
        }
        return finPrice;
    }
    
    public boolean placeOrder(){
        boolean Ret;
        do{
            System.out.println("your total is "+calculatePrice()+"$ Would you like to place the order?");
            System.out.println(" 1- Yes");
            System.out.println(" 2- No ");
            int fir =user.nextInt();
            System.out.println("");
            System.out.println("");
            if (fir==1){
                Ret = true;
                break;
            }
            else if (fir==2){
                System.out.println("What do you want ?");
                System.out.println("1- Remove product");
                System.out.println("2- Print my product");
                System.out.println("3- Exit the program");
                System.out.println(" Tap any number execpt above to Return previous menu");
                int sec = user.nextInt();
                System.out.println("");
                System.out.println("");
                System.out.println("");
                if (sec ==1){
                    removeProduct();
                }
                else if (sec==2){
                    System.out.println("Products");
                    for (int i =0; i<products.length;i++){
                        System.out.println((i+1)+" - "+products[i].getName()+" $"+products[i].getPrice()+".");    
                    }
                    
                } 
                else if (sec==3){
                    Ret = false;
                break;
                }
            }
            else{
                System.out.println("invalid input");
            }
            System.out.println("");
            System.out.println("");
        }while (true);
    return Ret;
    }
}
