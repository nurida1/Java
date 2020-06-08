package day48_Abstraction;

public class _2Iphone extends _1Phone {
    static {
        brand = "iPhone";
    }

    public _2Iphone(String model, double price, String size) {
        //brand = "iPhone";
        this.model = model;
        this.price = price;
        this.size = size;
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("iPhone is calling with " + phoneNumber);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("iPhone is facetiming with " + phoneNumber);
    }

    public void faceTiming(long phoneNumber) {
        System.out.println("Iphone is facetiming with " + phoneNumber);
    }


}
