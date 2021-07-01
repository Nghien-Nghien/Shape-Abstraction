import java.util.ArrayList;

public class Main {

    public static void main (String[] args) {
        System.out.println("This is program use to calculate Circuit n Area of Shapes:");
        ArrayList <Shape> shape = new ArrayList <>();

        shape.add(new Square(10.5f));
        shape.add(new Rectangle(11.0f,15.0f));
        for (int i = 0 ; i < shape.size() ; i++) {
            shape.get(i).printInformation();
        }
    }
}
