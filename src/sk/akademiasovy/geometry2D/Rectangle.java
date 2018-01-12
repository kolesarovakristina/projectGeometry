package sk.akademiasovy.geometry2D;

public class Rectangle implements Operations {
    private double a;
    private double b;

    public Rectangle(){
        a=b=0;
    }
    public Rectangle(double a){
        this.a=a;
    }
    public Rectangle(double a, double b){
       this.a=a;
       this.b=b;
   }
    @Override
    public double getArea(){
        return a*b;
    }
    @Override
    public double getPerimeter(){
        return 2*a+2*b;
    }
}
