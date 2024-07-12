package qap4_java.prob1_2;

public class EquilTri extends Triangle {
    private double side;

    public EquilTri(String name, double side) throws Exception {
        super(name, side, side, side);
        this.side = side;
    }
    
    @Override
    public double calcPerim() {
        return side*3;
    }

    @Override
    public double calcArea() {
        double s = calcPerim()/2;
        return Math.sqrt(s*(s-side)*(s-side)*(s-side));
    }
    @Override
    public void scale(double factor) {
        this.side *=factor;
    }
}
