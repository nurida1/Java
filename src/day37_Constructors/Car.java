package day37_Constructors;

public class Car {
    // INSTANCE VARIABLES:
    String brand;
    String model;
    int year;
    double price;

    // what do I have to do to be able to give values to the instance variables above as soon as I create the object?
    // I have to create the Constructor and pass parameters (No specifier, no returnType, just AM, and  name = class name, and parameters)
    public Car (String brand, String model, int year, double price) { //constructor
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;

    }

    // To specify how we want to print out the car: We need to use the toString() method like this:
    public String toString () {
        return year + " " + brand + " " + model + " $" + price;



    }

}
