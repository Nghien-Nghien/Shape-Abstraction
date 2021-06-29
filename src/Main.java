import java.util.ArrayList;

public class Main {

    public static void main (String[] args) {
        System.out.println("This is program use to calculate Circuit n Area of Shapes:");
        ArrayList <Float> Numbers = new ArrayList <>();
        Numbers.add(10.5f);
        Numbers.add(20.0f);
        Numbers.add(30.2f);
        Numbers.add(40.4f);

        Shape obj = new Rectangle(Numbers.get(0),Numbers.get(1));
        obj.printInformation();
        obj = new Rectangle(Numbers.get(2),Numbers.get(3));
        obj.printInformation();

        Numbers.add(5.5f);
        Numbers.add(9.0f);

        obj = new Square(Numbers.get(4));
        obj.printInformation();
        obj = new Square(Numbers.get(5));
        obj.printInformation();

        Numbers.set(0,10f);
        Numbers.set(1,20f);
        Numbers.set(2,30f);
        Numbers.set(3,40f);

        for (float i : Numbers) {
            System.out.print(i + " ");
        }
    }
}
