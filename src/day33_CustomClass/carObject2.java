package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class carObject2 {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setCarInfo("BMW", "X6", 2020, "white");
        car1.getCarInfo();

        Car car2 = new Car();
        car2.setCarInfo("Toyota", "Corolla", 2020, "black");
        car2.getCarInfo();

        Car car3 = new Car();
        car3.setCarInfo("Audi", "Q7", 2019, "Gray");
        car3.getCarInfo();

        System.out.println("=============================================================");

        Car [] cars = {car1, car2, car3};
//        String [] arr ={"A", "B", 123} --arrays data type is Car, two different objects, you cannot store 123

        for (int i = 0; i < cars.length; i++) {
            cars[i].getCarInfo();
        }

        for (Car eachCar : cars ) {
            eachCar.getCarInfo();
        }

        System.out.println("=============================================");

        System.out.println(car1);

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list1); //toString method gets executes automatically


    }

}
