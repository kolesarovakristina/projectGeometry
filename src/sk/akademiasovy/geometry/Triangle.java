 package sk.akademiasovy.geometry;


    public class Triangle {
        private double a;
        private double b;
        private double c;

        public Triangle(){
            a=3;
            b=4;
            c=5;
        }

        public Triangle(double a, double b, double c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        public double getPerimeter(){
            return a+b+c;
        }

        public double getArea(){
            double s=getPerimeter()/2;
            return Math.sqrt(s*(s-a)*(s-b)*(s-c));
        }
        public boolean isTriangleRectangular(){
            if(a*a+b*b==c*c)
                return true;
            else if(a*a+c*c==b*b)
                return true;
            else if (b*b+c*c==a*a)
                return true;
            else
                return false;

        }
        public boolean existsTriangle(){
            if(a+b>c && c+b>a && c+a>b)
                return true;
            else
                return false;

        }
        public boolean isTriangleEquilateral(){
            if(a==b && b==c)
                return true;
            else
                return false;
        }
        public boolean isTriangleIsosceles(){
            if ((a==b && b!=c ) || (a!=b && c==a) || (c==b && c!=a))
                return true;
            else
                return false;

        }
    }


