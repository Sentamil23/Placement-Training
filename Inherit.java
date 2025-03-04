class Shape{
    double l,b,bh,h,a,r,area;
    final double hf =0.5;
    final double pi =3.14;
    public double area(){
        return area;
    }
}
class Rectangle extends Shape{
    Rectangle(double l,double b){
        this.l=l;
        this.b=b;
    }
    public double area(){
        double area =l*b;
        return area;
    }
}
class Triangle extends Shape{
    Triangle(double bh,double h){
        this.bh=bh;
        this.h=h;
    }
    public double area(){
        double area=hf*bh*h;
        return area;
    }
}
class Square extends Shape{
    Square(double a){
        this.a=a;
    }
    public double area(){
        double area =a*a;
        return area;
    }
}
class Cricle extends Shape{
    Cricle(double r){
        this.r=r;
    }
    public double area(){
        double area=pi*r*r;
        return area;
    }
}
public class Inherit {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(12.0,13.0);
        System.out.println("Area of Rectangle: "+r.area());
        Triangle r1 = new Triangle(10.0,9.0);
        System.out.println("Area of Triangle: "+r1.area());
        Square r2 = new Square(11.0);
        System.out.println("Area of Square: "+r2.area());
        Cricle r3 = new Cricle(5.0);
        System.out.println("Area of Cricle: "+r3.area());

    }
}
