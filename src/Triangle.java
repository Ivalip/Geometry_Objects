public class Triangle extends GO {
    public double a, b, c;
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        double p = (a + b + c) / 2;
        this.square = Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public String toString() {
        return "Triangle{ " +
                "square = " + square +
                '}';
    }
}