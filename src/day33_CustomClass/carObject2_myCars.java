package day33_CustomClass;

import java.util.Arrays;

public class carObject2_myCars {

    /*
    1. create five car objects
    2. put them in an array of cars.
    3. use for loop to get each car info
    4. use for each loop to get each car info
     */
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.Brand = "Lexus";
        car1.model = "LX 570";
        car1.year = 2020;
        car1.color = "white";

        car1.start();
        car1.drive();
        car1.getCarInfo();

        System.out.println("=================");

        Car car2 = new Car();
        car2.Brand = "Lamborghini";
        car2.model = "SVJ Coupe";
        car2.year = 2020;
        car2.color = "white";

        car2.start();
        car2.drive();
        car2.getCarInfo();

        System.out.println("==================");

        Car car3 = new Car();
        car3.Brand = "Tesla";
        car3.model = "Cybertruck";
        car3.year = 2021;
        car3.color = "white";

        car3.start();
        car3.drive();
        car3.getCarInfo();

        System.out.println("====================");

        Car car4 = new Car();
        car4.Brand = "Mercedez";
        car4.model = "G class";
        car4.year = 2020;
        car4.color = "black";

        car4.start();
        car4.drive();
        car4.getCarInfo();

        System.out.println("====================");

        Car car5 = new Car();
        car5.Brand = "Toyota";
        car5.model = "Highlander";
        car5.year = 2020;
        car5.color = "white";

        car5.start();
        car5.drive();
        car5.getCarInfo();

        System.out.println("====================");

        Car cars [] = {car1, car2, car3, car4, car5};

        for (int i =0; i < cars.length; i++ ){
            cars[i].getCarInfo();
        }

        System.out.println("=============");

        for (Car each : cars) {
            each.getCarInfo();
        }

    }
}
