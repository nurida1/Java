package day38_Constructors;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 Create a class called Circle
            instance variables:
                    radius, pi, diameter
            add a constructor that can initialize the radius of the circle
            instance methods:
                    area(): can return the area of the circle as double
                    perimeter(): cna return the perimeter of the circle as double
                    toString(): returns the info of the circle
            Note: global value of PI is 3.14
                  diameter of circle = 2 * radius
                  area of circle = PI * r * r
                  perimeter: diameter * PI
 */
public class Circle {

    static double PI;
    double radius; //instance variable
    double diameter; //radius*2

    static  {
        PI = 3.14;// static variable (one copy of this variable for ALL circles - our objects)
    }
    // Here we will add a constructor that can initialize the radius of circle: we assign its value to our instance variable radius
    public Circle ( double radius ) {
        this.radius = radius;
        diameter = radius * 2; // no need for this. because it's the only variable with this name
        // diameter must be instance because each circle will have its own diameter depending on radius (which is instance)
    }

    public double area() {// must be instance method because we are using an instance variable in here
        return PI * radius * radius; // even though we are using a static variable BUT we are also using an instance one ==> instance method
    }

    public double perimeter() { // must be instance method because we are using an instance variable in here
        return diameter * PI;// even though we are using a static variable BUT we are also using an instance one ==> instance method
    } //  return diameter*pi; //(because diameter = 2*radius)

    public String toString () {
        return "Radius: " + radius +", diameter: " + diameter + ", area: " + area() + ", perimeter: " + perimeter();

    }
}

class CircleObject {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");

        Scanner scan = new Scanner( System.in) ;
        System.out.println("Enter the radius of the circle:");
        double r = scan.nextDouble();

        Circle circle1 = new Circle (r);

        double areaOfCircle = circle1.area();
        System.out.println("Diameter: " + circle1.diameter);
        System.out.println("Perimeter: " + circle1.perimeter());
        System.out.println("Area is:" + df.format( areaOfCircle ));

        System.out.println(circle1);
    }



    }
