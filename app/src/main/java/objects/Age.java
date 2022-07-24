package objects;

public class Age {
    private int age;


    public Age(int age){
        if(age>0){
            this.age=age;
        }
        else this.age = 0;
    }

    // Public Methods to access variables
    public int getAge() {
        return age;
    }
    //Setters
    public void setAge(int addAge) {
        if (addAge > 0) {
            this.age += addAge;
        }
    }
}
