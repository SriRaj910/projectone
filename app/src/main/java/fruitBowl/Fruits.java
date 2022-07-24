package fruitBowl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fruits {
  public static void main(String[] args) {
        NewBasket nb=new NewBasket();
        nb.addFruits();
        //Display old basket fruits
        nb.displayBasket();

        //types of fruit
        nb.typeSortBasket(nb.fruits);
        //fruit tray
        nb.traySeperator(nb.fruits);






    }

}
