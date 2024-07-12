package qap4_java.prob1_2;

public class Circle extends Ellipse {
    private double radius;

    public Circle(String name, double radius) {
        super(name, radius, radius);
        this.radius=radius;
    }

    @Override
    public double calcPerim() {
        return 2*Math.PI*radius;
    }

    @Override
    public double calcArea() {
        return Math.PI*Math.pow(radius, 2);
    }
    @Override
    public void scale(double factor) {
        this.radius*=factor;
    }

}
