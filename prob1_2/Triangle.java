package qap4_java.prob1_2;

public class Triangle extends shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String name,double side1,double side2,double side3) throws Exception {
        super(name);
        if (isValid(side1, side2, side3)) {
            this.side1=side1;
            this.side2=side2;
            this.side3=side3;
        }else{
            throw new Exception("Error not a triangle");
        }
    }

    private boolean isValid(double side1,double side2,double side3){
        return((side1+side2>side3)&&(side2+side3>side1)&&(side3+side1>side2));
    }

    @Override
    public double calcPerim() {
        return side1+side2+side3;
    }

    @Override
    public double calcArea() {
        double s = calcPerim()/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    @Override
    public void scale(double factor) {
        this.side1 *=factor;
        this.side2 *=factor;
        this.side3 *=factor;
    }
    
}
