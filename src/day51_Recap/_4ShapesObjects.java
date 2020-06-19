package day51_Recap;

import javafx.scene.shape.Cylinder;

import java.util.ArrayList;
import java.util.Arrays;

public class _4ShapesObjects {

    public static void main (String [] args) {
        _2Circle circle1 = new _2Circle(3);
        _2Circle circle2 = new _2Circle(5);

        _3Cylinder cylinder1 = new _3Cylinder(3,5);
        _3Cylinder cylinder2 = new _3Cylinder(3,5);

        //ArrayList - designed for objects
        //super class can reference to sub class' object
        // sub class cannot reference to super class' object
        //Shape  Circle -> polymorphism

        ArrayList<_1Shape> list = new ArrayList<>();
        list.addAll(Arrays.asList(circle1, circle2, cylinder1, cylinder2) );

        /*
        // _1Shape shape1 = circle1; //upcasting
        _1Shape shape2 = new _3Cylinder(3, 6);
        //shape2.calculateVolume() -- shape doesn't have calculateVolume method, in order to do that u need to downcast the Cylinder
        ((_3Cylinder)shape2).calculateVolume();
         */

        for (_1Shape eachShape : list) {
            System.out.println(eachShape.name + " : " + eachShape.calculateArea());
        }

        System.out.println("=====================================");

        ( (_3Cylinder) list.get(2) ).calculateVolume();

    }



}
