package shoppingCart;

import java.util.HashMap;
import java.util.Map;

public class Payment {
    double totalCost=0.0;

    public void calculate(Map<String,Integer> itemsInCart,Counter cc){
        cc=new Counter(1);
        this.totalCost+=itemsInCart.get("Milk") * cc.milkCost;
        this.totalCost+=itemsInCart.get("Apple")*cc.appleCost;
        this.totalCost+= itemsInCart.get("NewsPaper")* cc.newsPaperCost;

    }
    public void displayTotal(){
        System.out.println("Total Bill amount = "+this.totalCost+" Rupees");
    }

}
