package Practise.LinkedIn;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Kathryn");

        Car myCar = new Car(25.5, "1BC32E", Color.BLUE, true);

        Car sallyCar = new Car ( 13.9, "3D20BN", Color.BLACK, false);

        System.out.println("My Car's License Plate: " + myCar.licencePlate);
        System.out.println("Sally's Car's License Plate: " + sallyCar.licencePlate);

        System.out.println(myCar.paintColor.toString());
        myCar.changePaintColor(Color.red);
        System.out.println(myCar.paintColor.toString()); //RGB values, therefore need toString method

        double myCarSpeed = 50;
        myCarSpeed = myCar.speedingUp(myCarSpeed);
        System.out.println(myCarSpeed); //150

    }
}
