package e.commerce;
public class ElectronicProduct extends Product {
    private String brand;
    private int warrantyPeriod;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = Math.abs(warrantyPeriod);
    }
    
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
}