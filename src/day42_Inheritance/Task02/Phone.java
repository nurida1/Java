package day42_Inheritance.Task02;
/*
		create a class called phone:
				attributes: brand, model, price, country, type = "Phone";
				methods: call, text,  toString
 */
public class Phone extends Device {

    /*
    brand             (Inherited)
    model             (Inherited)
    price             (Inherited)
    country           (Inherited)
    type = "Phone";   (Inherited)
	size	          (Inherited)

    setDevice()       (Inherited)

    call
    text
    toString          (Inherited)
     */

    public Phone(String brand, String model, double price, String size, String country) {
        setDevice(brand, model, price, type = "Phone", size, country );
    }

    public void call (long number) {
        System.out.println("I'm calling with my new " +type + ", which is: " +brand + " " + model + " " + size + ",my number is:  " + number);
    }

    public void text (long number) {
        System.out.println("texting to: " + number);
    }

}
