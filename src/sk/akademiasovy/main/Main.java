package sk.akademiasovy.main;

import sk.akademiasovy.geometry.Rectangle;
import sk.akademiasovy.geometry.Square;

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




    }
}