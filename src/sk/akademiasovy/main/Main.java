package sk.akademiasovy.main;

import sk.akademiasovy.geometry2D.Circle;
import sk.akademiasovy.geometry2D.Rectangle;
import sk.akademiasovy.geometry2D.Square;
import sk.akademiasovy.geometry2D.Triangle;
import sk.akademiasovy.geometry3D.Cube;
import sk.akademiasovy.geometry3D.RectangularPrism;
import sk.akademiasovy.geometry3D.Sphere;

public class Main {
    public static void main(String[]args){
        Square square1=new Square(7.5);
        Square square2=new Square();

        System.out.println("Area of square is"+square1.getArea());
        System.out.println("Perimeter of square is "+ square1.getPerimeter());
        System.out.println("Diagonale of square is "+ square1.getDiagonale());


        Rectangle rect1=new Rectangle(18.5, 11.15);
        Rectangle rect2=new Rectangle();

        System.out.println("Area of rectangle is " +rect1.getArea());
        System.out.println("Perimeter of rectangle is " +rect1.getPerimeter());

        Triangle tria= new Triangle(3,4,5);
        System.out.println("Perimeter of triangle is " +tria.getPerimeter());
        System.out.println("Area of triangle is " +tria.getArea());
        System.out.println("Is triangle rectangular " +tria.isTriangleRectangular());
        System.out.println("Can triangle exists " +tria.existsTriangle());
        System.out.println("Is triangle equilateral " +tria.isTriangleEquilateral());
        System.out.println("Is triangle Isosceles " +tria.isTriangleIsosceles());

        Circle circ=new Circle(14.5);
        System.out.println("Perimeter of circle is " +circ.getPerimeter());
        System.out.println("Area od circle is " +circ.getArea());

        Sphere sph=new Sphere(6);
        System.out.println("Volume of sphere is " +sph.getVolume());
        System.out.println("Surface of sphere is " +sph.getSurface());

        Cube cube1=new Cube(6);
        System.out.println("Volume of cube is " +cube1.getVolume());
        System.out.println("Surface of cube is " +cube1.getSurface());
        System.out.println("Lateral surface of cube is " +cube1.getLateralSurface());

        RectangularPrism rectPrism1=new RectangularPrism(4,5,8);
        System.out.println("Volume of rectangular prism is " +rectPrism1.getVolume());
        System.out.println("Surface of rectangular prism is " +rectPrism1.getSurface());
        System.out.println("Diagonale of rectangular prism is " +rectPrism1.getDiagonale());






    }
}
