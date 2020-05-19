package day37_Constructors;

public class CarObjects {

    public static void main(String[] args) {
// in order to create my objects: I need to give className, objectName, 'new' keyword, Constructor (which is here accepting the 4 parameters)
        // now the values I provided here will be initialized to the instance variables immediately
        // to print each one separately:
        Car car1 = new Car("Toyota", "Corolla", 2020, 32000) ;
        System.out.println( car1.brand );
        System.out.println(car1.model );
        System.out.println(car1.year);
        System.out.println(car1.price);

        System.out.println(car1);

        Car car2 = new Car("Mercedez", "C300", 2018, 45000);

        System.out.println(car2);


    }

}
