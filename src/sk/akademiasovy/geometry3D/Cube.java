package sk.akademiasovy.geometry3D;

public class Cube implements Operations3D {
    private double a;

    public Cube (double a){
        this.a=a;
    }
    @Override
    public double getVolume() {
        return (a*a*a);
    }

    @Override
    public double getSurface() {
        return 6*(a*a);
    }
    public double getLateralSurface(){
        return  4*(a*a);
    }


}
