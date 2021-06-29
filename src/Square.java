public class Square extends Shape {
    float a;

    public Square (float a) {
        this.a = a;
    }

    public float Circuit() {
        return a*4;
    }

    public float Area () {
        return a*a;
    }

    public void printInformation () {
        System.out.println("Circuit of Square: " + Circuit() + " | " + "Area of Square: " + Area());
    }
}
