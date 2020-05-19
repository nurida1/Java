package day42_Inheritance.Task02;
/*
creata a class called device:
				attributes: brand, model, price, country, type
				methods: toString
 */
public class Device {

    public String brand;
    public String model;
    public double price;
    public String country;
    public String type;
    public String size;

    public String toString () {
        return "Brand: " + brand + ", Model: " + model + ", Type:" +type +", size: " +size  + ", Price: $" + price + ",Country: " + country;
    }

    public void setDevice(String brand, String model, double price, String type, String size, String country) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.type = type;
        this.size = size;
        this.country = country;
    }




}
