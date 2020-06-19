package Practise.LinkedIn;

import java.awt.* ;

public class Car {

    //Data Types:
    //int -> integer 1, 2, 3
    //double -> decimal 34.5, 32.1
    //String -> "a1a2" or "Hello World"
    //Color -> from awt library
    //boolean -> true or false

    double averageMilesPerGallon; // camel case - everyword except 1st is capitalized
    String licencePlate;
    Color paintColor;
    boolean areTailingWorking;

    public Car (double inputAverageMPG,
                String inputLicensePlate,
                Color inputPaintColor,
                boolean inputAreTailinglightsWorking) {
        this.averageMilesPerGallon = inputAverageMPG;
        this.licencePlate = inputLicensePlate;
        this.paintColor = inputPaintColor;
        this.areTailingWorking = inputAreTailinglightsWorking;

    }

    public void changePaintColor(Color newPaintColor) {
        this.paintColor=newPaintColor;
    }

}
