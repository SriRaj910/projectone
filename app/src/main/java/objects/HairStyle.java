package objects;

public class HairStyle {

        private String color;
        private String style;
        private int length;

        // Default Constructor
        public HairStyle() {
            this.style = "quiff";
        }

        public String getColor() { return color; }

        public void setColor(String color) { this.color = color; }

        public String getStyle() { return style; }

        public void setStyle(String style) { this.style = style; }

        public int getLength() { return length; }

        public void setLength(int length) { this.length = length; }

        public static void main(String[] args) {
            //
            HairStyle hs = new HairStyle(); // Default Constructor
            hs.setColor("undercut");
           hs.setLength(1);
            System.out.println(hs);
        }

    @Override

    public String toString() {
        return "{"
                + "\"color\":\""
                + color
                + "\""
                + ", \"style\":\""
                + style
                + "\""
                + ", \"length\":\""
                + length
                + "\""
                + "}";
    }
}
