package sk.akademiasovy.geometry3D;

public class Sphere implements Operations3D {
    private double r;

    public Sphere (double r){
        this.r=r;
    }



    @Override
    public double getVolume() {
        return (4 * Math.PI * Math.pow(r, 3)) / 3;

    }

    @Override
    public double getSurface() {
        return 4 * Math.PI * Math.pow(r, 2);
    }
}
