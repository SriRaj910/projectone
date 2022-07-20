package objects;

public class PencilBox {
    public class Pencil {
        int length;
        int width;
        String colour;
        public int getLength(){
            return length;
        }

        public boolean isSharpened() {
            return true;
        }

        public boolean canErase() {
            return false;
        }

        public boolean isAbleToWrite() {
            return true;
        }

        public String getColour() {
            return colour;
        }

    }
}
