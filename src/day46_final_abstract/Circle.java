package day46_final_abstract;

public class Circle extends Shape{

    public double radius;
    public final double PI =3.14; //or final or static

    public Circle (double radius) {
        this.radius = radius;
    }


    @Override
    public void Area() { // we need to provide method overriding
        double area = radius * radius * PI;
        System.out.println("Area of circle is: " + area);
    }




}


