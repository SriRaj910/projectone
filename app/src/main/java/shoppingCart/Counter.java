package shoppingCart;

public class Counter {
    String[] itemsAvailable={"Apple","Milk", "NewsPaper"};
    double milkCost=50.0;
    double appleCost=25.0;
    double newsPaperCost=10.0;
    public Counter(){
        System.out.println("Welcome to Grocery Store");
    }
    public Counter(int n){
        System.out.println("Calculating your bill Amount!! Please wait!!");
    }
    public void displayCost(){
        System.out.println("Cost of 1 kg apple is "+ appleCost);
        System.out.println("Cost of 1 litre milk is "+ milkCost);
        System.out.println("Cost of 1 newspaper is "+ newsPaperCost);

    }

}
