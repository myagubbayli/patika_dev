public class Circle {
    public int radius;
    public final double PI_NUMBER = 3.14;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void calcArea() {
        double area = PI_NUMBER * this.radius * this.radius;
        System.out.println("Area of the circle: " + area);
    }
}
