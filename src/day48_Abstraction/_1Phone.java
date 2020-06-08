package day48_Abstraction;
/*
Warmup tasks:
	1. create an abstract class called Phone
			attributes: brand, model, price, size
			abstract methods: calling(), texting()
			instance method: toString()
	2. create the following subclasses of phone:
						1. iPhone
						2. Samsung
			create constructors in each sub class that can initialize the instance variables
 */
public abstract class _1Phone {

    public static String brand;
    public String model;
    public double price;
    public String size;

    public abstract void calling(long phoneNumber);

    public abstract void texting(long phoneNumber);

    public String toString() {
        return "Brand: " +brand + ", Model: " + model + ", Price:" + price + ", Size: " + size;

    }


}


    //abstract class A extends Phone { //it's optional to override
    //class A extends Phone { // you have to ovveride

