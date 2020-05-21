package day43_MethodOverriding;

public class _1ShapeObjects {
    public static void main(String[] args) {

        _1Circle circle1 = new _1Circle(3);

        System.out.println(circle1.radius);

        circle1.calculateArea();  // bug
        circle1.calculatePerimeter();  //bug

        System.out.println("============================================");

        _1Rectangle rec1 = new _1Rectangle(3,2);

        System.out.println(rec1.length);


    }
}
