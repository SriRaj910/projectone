package shoppingCart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cart {

    Map<String,Integer> items=new HashMap<>();

    public void addApple(int n){
        items.put("Apple",n);
    }
    public void addMilk(int n){
        items.put("Milk",n);
    }
    public void addNewsPaper(int n){
        items.put("NewsPaper",n);
    }

    public void displayCart(){
        System.out.println("You have following items in your cart");
        System.out.println(this.items);
    }

    public void replaceMilk(int b){
        int a=this.items.get("Milk");
        this.items.replace("Milk",a+b);

    }


}
