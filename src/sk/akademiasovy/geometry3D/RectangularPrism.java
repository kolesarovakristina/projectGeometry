package sk.akademiasovy.geometry3D;

public class RectangularPrism implements Operations3D {
    private double length;
    private double width;
    private double height;

    public RectangularPrism(double length, double width, double height){
        this.length=length;
        this.width=width;
        this.height=height;
    }

    @Override
    public double getVolume() {
        return length*width*height;
    }

    @Override
    public double getSurface() {
        return (length*width*2 + length*height*2 + height*width*2);

    }

    public double getDiagonale(){
        return Math.sqrt(length*length+width*width+height*height);
    }
}
