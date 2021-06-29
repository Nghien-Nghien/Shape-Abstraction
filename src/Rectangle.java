public class Rectangle extends Shape {
    float a;
    float b;

    public Rectangle (float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float Circuit() {
        return (a+b)*2;
    }

    public float Area () {
        return a*b;
    }

    public void printInformation () {
        System.out.println("Circuit of Rectangle: " + Circuit() + " | " + "Area of Rectangle: " + Area());
    }
}
