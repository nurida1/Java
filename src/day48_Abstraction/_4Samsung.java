package day48_Abstraction;

public class _4Samsung extends _1Phone{

    static {
        brand = "Samsung";
    }

    public _4Samsung (String model, double price, String size) {
        this.model = model;
        this.price = price;
        this.size = size;
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Samsung is calling " + phoneNumber);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Samsung is texting " + phoneNumber);
    }

    public void downloading (long phoneNumber) {
        System.out.println("Samsung is downloading with " + phoneNumber);
    }

}
