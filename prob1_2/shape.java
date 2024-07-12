package qap4_java.prob1_2;

public abstract class shape implements Scalable {
    protected String name;
    
    public shape(String name){
        this.name = name;
    }
    public abstract double calcPerim();
    public abstract double calcArea();

    @Override
    public String toString() {
        return "Shape: "+name+"Perimeter: "+calcPerim()+" Area: "+calcArea();
    }
}