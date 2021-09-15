package Assignment2;

import java.util.Scanner;

public class DessertShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String role = sc.next();

        if(role.equalsIgnoreCase("customer")){
            Order o = new Order();
            o.placeOrder(sc.next(),sc.nextInt());
        }
        else{
            Storage s = new Storage();
            s.addInStorage(sc.next());
            s.displayStorage();
        }
    }
}
abstract class DessertItem {
    int tax = 10;
    abstract void getCost();
}
class Candy extends DessertItem {
    int noOfCandies;
    private int priceInRupees = 10;
    private int tax;
    Candy(int num){
        this.noOfCandies = num;
        this.tax = 20;
    }
    @Override
    void getCost() {
        System.out.println("Total cost is : $"+ (priceInRupees*noOfCandies/60.0+tax));
    }
}
class Cookie extends DessertItem {
    int noOfCookie;
    private int priceInRupees = 20;
    final private int tax;
    public Cookie(int noOfCookie) {
        this.noOfCookie = noOfCookie;
        this.tax = 30;
    }
    @Override
    void getCost() {
        System.out.println("Total cost is : E"+ (priceInRupees*noOfCookie/70.0+tax));
    }
}
class IceCream extends DessertItem {
    int noOfIceCream;
    private int tax;
    private int priceInRupees = 30;

    public IceCream(int noOfIceCream) {
        this.noOfIceCream = noOfIceCream;
        this.tax = 40;
    }

    @Override
    void getCost() {
        System.out.println("Total cost is : Rs."+ (priceInRupees * noOfIceCream + tax));
    }
}
class Order{
    void placeOrder(String item, int amt){
        if(item.equalsIgnoreCase("candy")){
            DessertItem d = new Candy(amt);
            d.getCost();
        }
        else if(item.equalsIgnoreCase("cookie")){
            DessertItem d = new Cookie(amt);
            d.getCost();
        }
        else{
            DessertItem d = new IceCream(amt);
            d.getCost();
        }
    }
}
class Storage {
    int capacity = 1;
    String[] storage = new String[capacity];
    int i = 0;
    void addInStorage(String item){
        if(i < 10)
            storage[i++]= item;
    }
    void displayStorage(){
        for(String items : storage){
            System.out.print(items+ " ");
        }
    }
}