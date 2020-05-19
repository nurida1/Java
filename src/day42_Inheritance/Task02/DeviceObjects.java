package day42_Inheritance.Task02;

public class DeviceObjects {

    public static void main(String[] args) {

        TV tv1 = new TV("Samsung", "E250", 500, "40 inches" ,"China") ;
        tv1.country = "USA";
        System.out.println(tv1); //Brand: Samsung, Model: E250, Type:TV, size: 40 inches, Price: $500.0,Country: USA

        Phone phone1 = new Phone("Iphone", "11", 1_000, "Large", "China");

        System.out.println(phone1);

        phone1.call(12341);
    }

}
