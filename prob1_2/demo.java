package qap4_java.prob1_2;

public class demo {
    public static void main(String[] args) throws Exception {
        shape circle = new Circle("Circle ", 5.0);
        shape ellipse = new Ellipse("Ellipse ", 6.0, 4.0);
        shape triangle = new Triangle("Triangle ", 3.0, 4.0, 5.0);
        shape EquilTri = new EquilTri("EquilTri ", 4.0);
        
        shape[] shapes = {circle, ellipse, triangle, EquilTri};
        
        System.out.println("Before scaling");
        for (shape i : shapes) {
            System.out.println(i.toString());
        }
        
        scaleShapes(shapes, 3);

        System.out.println("After scaling");
        for (shape i : shapes) {
            System.out.println(i.toString());
        }

    }
    public static void scaleShapes(Scalable[] scalable,double factor){
        for(Scalable i : scalable){
            i.scale(factor);
        }
    }
}
