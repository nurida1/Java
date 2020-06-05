package day46_final_abstract;

public abstract class Rectangle extends Shape{

    public double width;
    public double length;

    public Rectangle (double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public void Area () {
        double area = width * length;
        System.out.println("Area of rectangle: "+ area);
    }


}
