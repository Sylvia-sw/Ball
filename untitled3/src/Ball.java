public class Ball {
    private String model;
    private String make;
    private float price;

    public Ball() {
        this.price = 500;
        this.model = "ACME Model";
        this.make = "ACME Make";
    }

    public Ball(String make, String model, float price) {
        this.price = price;
        this.model = model;
        this.make = make;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
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

    public String toString() {
        return "Ball Details" + "\n" +
                "Make : " + make + "," +
                "Model : " + model + "," +
                "Price : " + price ;
    }
}