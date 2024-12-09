public class Product {
    private String model;
    private String make;
    private String name;
    private float price;
    private int customerID;
    public Product() {
        this.model = "ACME Model";
        this.make = "ACME Make";
        this.name = "ACME Name";
        this.price = 5000;
        this.customerID = 123456;
    }
    public Product(String model, String make, String name,float price,int customerID) {
        this.model = model;
        this.make = make;
        this.name = name;
        this.price = price;
        this.customerID = customerID;
    }
    
    public String getModel() {

        return model;
    }
public void setModel(String model) {

        this.model = model;
}
public String getMake() {

        return make;
}
public void setMake(String make) {

        this.make = make;
}
    public float getPrice() {

        return price;
    }
    public void setPrice(float price) {

        this.price = price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public java.lang.String toString() {
        return "Product{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", customerID=" + customerID +
                '}';
    }


