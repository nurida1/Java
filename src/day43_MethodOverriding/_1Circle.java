package day43_MethodOverriding;

public class _1Circle extends _1Shape {

    public double radius;
    public static double PI = 3.14;

    public _1Circle(double radius) {
        this.radius = radius;
    }


    /*
   calculateArea & calculatePerimeter
     */

    public void calculateArea () {
        area = 0;
        System.out.println("Area of the Circle: " + area);
    }

    




}
