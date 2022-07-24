package shoppingCart;

public class EWallet {
    double balance=10000000;

    public void debit(double amt){
        this.balance-=amt;
    }
    public void credit(double amt){
        this.balance+=amt;
    }
    public void displayBalance(){
        System.out.println("The Remaining balance in your wallet is "+this.balance);
    }
    public boolean errorMessage(double amt){
        if (amt>this.balance){
            System.out.println("Not enough balance");
            return  false;
        }
        else{
            return true;
        }


    }
}
