public class Circle extends GO {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
        this.square = Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle{ " +
                "square = " + square +
                '}';
    }
}
