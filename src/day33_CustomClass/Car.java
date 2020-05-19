package day33_CustomClass;

import java.time.Year;

public class Car {

    String Brand; //instance variable
    String model; //instance variable
    int year;     //instance variable
    String color; //instance variable

    public void start() { // if static- not object, belongs to class
        System.out.println(Brand + " is started");
    }

    public void drive() {
        System.out.println("Driving " + Brand+ " "+ model);
    }

    public void getCarInfo() {

        System.out.println(year + " " + Brand + " " + model +" " + color);
    }

    public void setCarInfo(String carBrand, String carModel, int carYear, String carColor) {
        Brand = carBrand;
        model = carModel;
        year = carYear;
        color = carColor;  //custom method
    }

    public String toString() {//automatically executed, we don't need to call in print statement
        String result = Brand + " " + year + " " + model + " " + color;
        return result;
    }




    public static void main(String[] args) {
        int a = 100; //local variable



    }
}
