import java.awt.*;

public class Main {
    public static void main(String[] args) {
    }
}
        interface Animal {
            Color getColor();
}
class Fox implements Animal {
    public String getName() {
        return "Fox";



    }


    @Override
    public Color getColor() {
        return null;
    }
}
