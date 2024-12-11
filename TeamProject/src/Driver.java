import java.util.Scanner;
public class Driver {
    private Scanner input = new Scanner(System.in);
    private Store store;
    public static void main(String[] args){
        Driver driver = new Driver();
        driver.processOrder();
        driver.printProduct();
    }
    private void processOrder(){
        System.out.print("What do you want to buy, ball or racket?");
        String nameProducts = input.nextLine();
        if (nameProducts == ball){
            System.out.println("What kind of ball do you want to buy, " +
                    "football, basketball or volleyball?")
        }
        String nameBalls = input.nextLine();
        else if (nameProducts == racket) {
            System.out.println("What kind of racket do you want to buy," +
                    "tennis racket, badminton racket or ping pong bat?")
        }
        String nameRackets = input.nextLine();

        if (nameBalls == football){
            System.out.println("A football is 200RMB. How many do you want to buy?")
        }
        int i == input.nextInt();
        private float price;
        public Product() {
            this.price = 200;
        }
        public Product(float price){
            this.price = price;
        }
        public float getPrice() {

            return price;
        }
        public void setPrice(float price) {

            this.price = price;
        }
        public java.lang.String toString() {
            return "Product{" + "price=" + price + '}';
        }
        System.out.println("You need to pay)

        store = new Store(numberProducts);

        for (int i = 0; i < numberProducts; i++){
            addProduct();
        }
    }
    private void addProduct(){
        input.nextLine();
        System.out.print("Enter the Product Name:  ");
        String productName = input.nextLine();
        System.out.print("Enter the Product Code:  ");
        int productCode = input.nextInt();
        System.out.print("Enter the Unit Cost:  ");
        double unitCost = input.nextDouble();

        System.out.print("Is this product in your current line (y/n): ");
        char currentProduct = input.next().charAt(0);
        boolean inCurrentProductLine = false;
        if ((currentProduct == 'y') || (currentProduct == 'Y'))
            inCurrentProductLine = true;

        boolean isAdded = store.add(new Product(productName, productCode, unitCost, inCurrentProductLine));
        if (isAdded){
            System.out.println("Product Added Successfully");
        }
        else{
            System.out.println("No Product Added");
        }
    }

    private void printProduct(){
        System.out.println(store.listProducts());
    }
}
