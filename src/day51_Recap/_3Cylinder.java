package day51_Recap;
/*
5. create a final class named Cylinder that can inherit from Shape, Volume, and PI
                variables: radius, Height
                set a static block that initialize the name to "Circle"
                set a constructor that can initialize the radius and height

 6. create a class named ShapeObjects
                1. create two circle and two Cylinder' objects
                2. create an ArrayList that can contain  all those objects

    Note:   Volume of Cylinder = PI * radius * radius * height
            Area of Cylinder = (PI * diameter * radius) + (height * PI * diameter);
            Perimeter of Cylinder = 2 * (PI * diameter + height)
            Area of Circle = PI * radius * radius
            Perimeter of Circle = 2 * radius * PI

 */
public final class _3Cylinder extends _1Shape implements _1Shape.Volume, _1Shape.PI {
//so far: 3 var, 3 methods
//in total: 5 var later:
                        // 1 static
                        // 2 final
                        //2 instance - u need constructor 2 initialize radius and height

    static {
        name = "Cylinder";
    }

    public _3Cylinder (double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double radius;
    public double height;

    @Override
    public double calculateArea() {
        //(PI * diameter * radius) + (height * PI * diameter) diameter = 2*radius
        return (PI * 2 * radius * radius) + (height * PI * 2 * radius);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (PI * 2 * radius + height);
    }

    @Override
    public double calculateVolume() {
        return PI * radius * radius * height;
    }




}
