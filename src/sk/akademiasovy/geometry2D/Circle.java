package sk.akademiasovy.geometry2D;

public class Circle implements Operations {
    private double r;

    public Circle (double r){
        this.r=r;
    }

    @Override
    public double getArea() {
        return Math.PI*r*r;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*r;
    }
}
