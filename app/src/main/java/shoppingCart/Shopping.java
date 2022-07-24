package shoppingCart;

import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {
        Counter cc=new Counter();
        Cart ca=new Cart();
        Payment pa=new Payment();
        //Display of items available with cost

        cc.displayCost();

        // Adding elements to cart
        Scanner sc= new Scanner(System.in);
        int n=0;
        System.out.println("Enter the quantity of Milk");
        n=sc.nextInt();
        if(n>0){
            ca.addMilk(n);
            n=0;
        }
        System.out.println("Enter the quantity of Apples");
        n=sc.nextInt();
        if(n>0){
            ca.addApple(n);
            n=0;
        }
        System.out.println("Enter the quantity of News Paper");
        n=sc.nextInt();
        if(n>0){
            ca.addNewsPaper(n);
            n=0;
        }
        // Displaying Cart items

        ca.displayCart();

        // Calculating Total Bill Amount
        pa.calculate(ca.items,cc);

        //Display total bill amount
        pa.displayTotal();

        //Check offers and disounts
        Benefits b1=new Benefits();
        int newMilk=b1.checkOffer(ca.items.get("Milk"));
        if (newMilk>0){
            ca.replaceMilk(newMilk);
        }
        b1.checkDiscounts(pa.totalCost);
        if (b1.discount==5){
            b1.availDiscount(pa.totalCost,pa);
        }
        // displaying final amount and items

        pa.displayTotal();
        ca.displayCart();

        //Payment through wallet
        EWallet ew=new EWallet();
        boolean proceed= ew.errorMessage(pa.totalCost);
        if (proceed){
            ew.debit(pa.totalCost);
            System.out.println("ThankYou For Shopping with us!! Have A nice day.");

        }
        else {
            System.out.println("Please Recharge Your Wallet");
        }










    }
}
