public class Rectangle extends GO {
    double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
        this.square = a * b;
    }

    @Override
    public String toString() {
        return "Rectangle{ " +
                "square = " + square +
                '}';
    }
}