package shoppingCart;

public class Benefits extends Payment {
    int discount=0;
    public Benefits(){
        System.out.println("Checking For offers and Discount!!!!!!");
    }
    public int checkOffer(int n){
        int addedMilk= n/2;
        if (addedMilk>0) {
            System.out.println("Congratulations!!! You can avail " + addedMilk + " litres of milk");
        }
        else {
            System.out.println("No eligible offer found!!");
        }
        return addedMilk;

    }

    public void checkDiscounts(double bill){
        if (bill>100.0){
            System.out.println("Congratulations!!! You are eligible for 5 % discount");
            this.discount=5;
        }
        else{
            System.out.println("Not eligible for discount. Please add value worth rupees "+(100-bill)+"to avail 5 % discount");
        }


    }


    public void availDiscount(double bill, Payment pa){
        System.out.println("Calculating New Bill Amount");
        double discount=(this.discount*pa.totalCost)/100;
        pa.totalCost-=discount;

    }
}

