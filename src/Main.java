public class Main {

    public static void main (String[] args) {
        System.out.println("This is program use to calculate Circuit n Area of Shapes:");

        Shape obj = new Square(12);
        obj.printInformation();

        obj= new Rectangle(2,3);
        obj.printInformation();

        obj = new Rectangle(10,9);
        obj.printInformation();

        obj = new Square(20);
        obj.printInformation();
    }
}
