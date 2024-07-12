package qap4_java.prob1_2;

public class Ellipse extends shape {
    private double majorAxes;
    private double minorAxes;
    
    public Ellipse(String name,double axesA,double axesB) {
        super(name);
        if(majorAxes>minorAxes){
            this.majorAxes=axesA;
            this.minorAxes=axesB;
        }else{
            this.majorAxes=axesA;
            this.minorAxes=axesB;
        }
    }
    @Override
    public double calcPerim() {
        return Math.PI * Math.sqrt(2*(Math.pow(majorAxes, 2)+Math.pow(minorAxes, 2))-Math.pow((majorAxes-minorAxes),2)/2);
    }
    @Override
    public double calcArea() {
        return Math.PI * majorAxes * minorAxes;
    }
    @Override
    public void scale(double factor) {
        this.majorAxes*=factor;
        this.minorAxes*=factor;
    }

}
