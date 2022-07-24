package objects;

public class Rectangle {


        // declare variables as private
        private double length;
        private double width;


        public Rectangle(double length,double width) {
            this.length = length;
            this.width = width;
        }

        // Public Methods to access variables
        public double getLength() {
            return length;
        }

        public double getWidth() {
            return width;
        }

        //Setters
        public void setLength(double length) {
            this.length = length;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public static void main(String[] args) {
            //
            Rectangle rect = new Rectangle(5, 25);
            rect.setLength(6);
            System.out.println(rect.getLength());
        }
    }

