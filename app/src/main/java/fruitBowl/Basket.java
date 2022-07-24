package fruitBowl;

import java.util.ArrayList;

public class Basket {
    ArrayList<String> fruits=new ArrayList();
    public void addFruits(){
        this.fruits.add("Apple");
        this.fruits.add("Banana");
        this.fruits.add("Apple");
        this.fruits.add("Grapes");
        this.fruits.add("Mango");
        this.fruits.add("Banana");
        this.fruits.add("Banana");
        this.fruits.add("Banana");
        this.fruits.add("Apple");
        this.fruits.add("Grapes");
        this.fruits.add("Grapes");
        this.fruits.add("Cherry");
        this.fruits.add("Cherry");
        this.fruits.add("Cherry");
        this.fruits.add("Cherry");
        this.fruits.add("Watermelon");
        this.fruits.add("Mango");
    }
    public void displayBasket(){
        System.out.println("Fruits are");
        System.out.println(fruits);
    }
}
