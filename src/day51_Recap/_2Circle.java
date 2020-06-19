package day51_Recap;

import day43_MethodOverriding._1Circle;

/*
4. create a final class named circle that can inherit from Shape and PI
                variable: radius
                set a static block that initialize the name to "Circle"
                set a constructor that can initialize the radius

 */
public final class _2Circle extends _1Shape implements _1Shape.PI {

    public double radius;

    public _2Circle (double radius) {
        this.radius = radius;
    }

    static {
        name = "Circle";
    }


    @Override
    public double calculateArea() {
        return radius*radius*PI;
    }

    @Override
    public double calculatePerimeter() {
        return 2*radius*PI;
    }
}
