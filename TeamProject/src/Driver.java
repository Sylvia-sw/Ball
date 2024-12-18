import java.util.*;
import java.util.concurrent.TimeUnit;

public class Driver {
    static Scanner input =new Scanner(System.in);
    static List<Integer>price=new ArrayList<>();
    Information information=new Information();
    public static void main(String[] args) {
        Driver driver =new Driver();
        setup();
        driver.runMenu();

    }

    private int mainMenu(){
        System.out.println("""
                    ________________________________________________________________________
                    |                      \033[46m Shop Menu\033[0m                                      |
                    |----------------------------------------------------------------------|
                    |\033[36m1)Please input your personal information\033[0m                              |
                    |----------------------------------------------------------------------|
                    |\033[36m2)What kind of sports product do you want to buy?\033[0m                     |
                    |----------------------------------------------------------------------|
                    |\033[36m3)What kind of food do you want to buy?\033[0m                               |
                    |----------------------------------------------------------------------|
                    |\033[36m4)What kind of clothes do you want to buy?\033[0m                            |
                    |----------------------------------------------------------------------|
                    |\033[36m5)Tell the total price\033[0m                                                |
                    |----------------------------------------------------------------------|
                    |\033[36m0)Exit\033[0m                                                                |
                    |----------------------------------------------------------------------|
                    ==>>""");
        int option=input.nextInt();
        return option;
    }
    private void runMenu(){
        int option=mainMenu();
        while(option!=0){
            switch(option){
                case 1->addInformation();
                case 2->buySports();
                case 3->buyFood();
                case 4->buyClothes();
                case 5->tellPrice();
                default-> System.out.println("Invalid option entered:"+option);
            }
            System.out.println("\nPress enter key to continue...");
            input.nextLine();
            input.nextLine();
            option=mainMenu();
        }
        System.out.println("Exiting...bye");
        System.exit(0);
    }
    public void buySports(){
        System.out.println("What do you want to buy for sports,ball or racket?");
        input.nextLine();
        String nameProducts=input.nextLine();
        if(nameProducts.equals("ball")){
            System.out.println("What kind of ball do you want to buy,football,basketball or volleyball?");
            String nameBalls=input.nextLine();
            if (nameBalls.equals("football")){
                System.out.println("A football is 200RMB. How many do you want to buy?");
                int i=input.nextInt();
                System.out.println("You need to pay "+i*200);
                price.add(i*200);
            }

            if (nameBalls.equals("basketball")){
                System.out.println("A basketball is 300RMB. How many do you want to buy?");
                int j=input.nextInt();
                System.out.println("You need to pay "+j*300);
                price.add(j*300);
            }

            if (nameBalls.equals("volleyball")){
                System.out.println("A volleyball is 150RMB. How many do you want to buy?");
                int m=input.nextInt();
                System.out.println("You need to pay "+m*150);
                price.add(m*150);
            }

        }

        if(nameProducts.equals("racket")){
            System.out.println("What kind of racket do you want to buy,tennis racket ,badminton racket or ping pong bat? ");
            String nameRackets=input.nextLine();
            if (nameRackets.equals("tennis racket")){
                System.out.println("A football is 350RMB. How many do you want to buy?");
                int i=input.nextInt();
                System.out.println("You need to pay "+i*350);
                price.add(i*350);
            }

            if (nameRackets.equals("badminton racket")){
                System.out.println("A basketball is 450RMB. How many do you want to buy?");
                int j=input.nextInt();
                System.out.println("You need to pay "+j*450);
                price.add(j*450);
            }

            if (nameRackets.equals("ping pong bat")){
                System.out.println("A ping pong bat is 100RMB. How many do you want to buy?");
                int m=input.nextInt();
                System.out.println("You need to pay "+m*100);
                price.add(m*100);
            }
        }
    }
    public static void buyFood(){
        Map<String, Integer> map = new HashMap<>();
        map.put("instant noodles", 4);
        map.put("ham sausage", 3);
        map.put("chicken leg", 5);
        map.put("coffee", 20);
        map.put("tea", 15);
        map.put("baozi", 2);
        map.put("dumplings", 20);
        map.put("porridge", 7);
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println("Food Products: " + entry.getKey() +
                    ", Price:" + entry.getValue());
        }
        System.out.println("What kind of food do you want to buy?");
        input.nextLine();
        String foodName=input.nextLine();
        if(foodName.equals("instant noodles")){
            price.add(map.get("instant noodles"));
            System.out.println("Successfully added to cart");
        }
        if(foodName.equals("ham sausage")){
            price.add(map.get("ham sausage"));
            System.out.println("Successfully added to cart");
        }
        if(foodName.equals("chicken leg")){
            price.add(map.get("chicken leg"));
            System.out.println("Successfully added to cart");
        }
        if(foodName.equals("coffee")){
            price.add(map.get("coffee"));
            System.out.println("Successfully added to cart");
        }
        if(foodName.equals("tea")){
            price.add(map.get("tea"));
            System.out.println("Successfully added to cart");
        }
        if(foodName.equals("baozi")){
            price.add(map.get("baozi"));
            System.out.println("Successfully added to cart");
        }
        if(foodName.equals("dumplings")){
            price.add(map.get("dumplings"));
            System.out.println("Successfully added to cart");
        }
        if(foodName.equals("porridge")){
            price.add(map.get("porridge"));
            System.out.println("Successfully added to cart");
        }
        System.out.println("Do you want to buy more?(Y/N)");
        String answer=input.next();
        if(answer.equals("Y")){
            buyFood();
        }
        else{
            System.out.println("OK,let's look at other type of products");
        }
    }

    public void buyClothes(){
        Map<String, Integer> map = new HashMap<>();
        map.put("vest", 100);
        map.put("waistcoat", 150);
        map.put("lace top", 300);
        map.put("cardigan", 200);
        map.put("shirt", 150);
        map.put("skirt", 150);
        map.put("tie", 20);
        map.put("collar", 20);
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println("Clothes Products: " + entry.getKey() +
                    ", Price:" + entry.getValue());
        }
        System.out.println("What kind of clothes do you want to buy?");
        input.nextLine();
        String foodName=input.nextLine();
        if(foodName.equals("vest")){
            price.add(map.get("vest"));
            System.out.println("Successfully added to cart");
        }
        if(foodName.equals("waistcoat")){
            price.add(map.get("waistcoat"));
            System.out.println("Successfully added to cart");
        }
        if(foodName.equals("lace top")){
            price.add(map.get("lace top"));
            System.out.println("Successfully added to cart");
        }
        if(foodName.equals("cardigan")){
            price.add(map.get("cardigan"));
            System.out.println("Successfully added to cart");
        }
        if(foodName.equals("shirt")){
            price.add(map.get("shirt"));
            System.out.println("Successfully added to cart");
        }
        if(foodName.equals("skirt")){
            price.add(map.get("skirt"));
            System.out.println("Successfully added to cart");
        }
        if(foodName.equals("tie")){
            price.add(map.get("tie"));
            System.out.println("Successfully added to cart");
        }
        if(foodName.equals("collar")){
            price.add(map.get("collar"));
            System.out.println("Successfully added to cart");
        }
        System.out.println("Do you want to buy more?(Y/N)");
        String answer=input.next();
        if(answer.equals("Y")){
            buyClothes();
        }
        else{
            System.out.println("OK,let's look at other type of products");
        }

    }
    public void tellPrice(){
        int i=0;
        for (Integer pri : price) {
            i+=pri;
        }
        if(information.getVIP().equals("Y")){
            i= (int) (i*0.8);
        }
        System.out.println("The total money you need to pay is "+i+"RMB");
    }
    public void addInformation(){
        System.out.println("Please input your customerID");
        int ID=input.nextInt();
        information.setCustomerID(ID);
        System.out.println("Please input your name");
        String name=input.next();
        information.setName(name);
        System.out.println("Please input your gender");
        String gender=input.next();
        information.setGender(gender);
        System.out.println("Are you our VIP(Y/N)");
        String VIP=input.next();
        information.setVIP(VIP);
        System.out.println(information.toString());
    }
    public static void setup() {
        System.out.println("///////////////////////////////////////");
        System.out.println("\033[46mWelcome to my Shop\033[0m");
        System.out.println("///////////////////////////////////////");
        System.out.println();
        System.out.println();
        System.out.print("Please wait while the system loads...");
        try {
            System.out.print("...");
            TimeUnit.SECONDS.sleep(1);
            System.out.print("...");
            TimeUnit.SECONDS.sleep(1);
            System.out.print("...");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("...");
            System.out.println();
        }
        catch(Exception e) {}
    }
}
