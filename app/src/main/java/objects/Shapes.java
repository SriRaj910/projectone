package objects;

public class Shapes {
    int length;
    int breadth;
    int radius;
    int triangleHeight;
    int side;

    public int getSquareArea(){
        return side*side;
    }

    public int getRectArea() {
        return breadth*length;
    }

    public double getCircleArea(){
        return 2*3.14*radius;
    }
}
