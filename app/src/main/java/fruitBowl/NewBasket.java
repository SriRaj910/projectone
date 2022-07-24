package fruitBowl;

import java.util.*;

public class NewBasket extends Basket{
    Set<String> fruitSet=new HashSet<>();
    Map<String , Integer> fruitMap=new HashMap<>();
    public void typeSortBasket(ArrayList<String> fruit){
        Set<String> fruitSet=new HashSet<>(fruit);
        this.fruitSet=fruitSet;
        System.out.println("Different types of fruits are");
        System.out.println(this.fruitSet);

    }
    public void traySeperator(ArrayList<String> fruit){

        for(String f:fruit){
            if(this.fruitMap.get(f)==null){
                fruitMap.put(f,1);
            }
            else{
                int n=this.fruitMap.get(f);
                this.fruitMap.replace(f,n+1);
            }
        }
        System.out.println("Fruit Tray");
        System.out.println(this.fruitMap);
    }
}
