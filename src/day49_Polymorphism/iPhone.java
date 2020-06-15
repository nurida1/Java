package day49_Polymorphism;

public final class iPhone extends Phone implements AppleApps {

    static {
        brand="Apple";
    }

    public iPhone (String model, double price, String size) {
        this.model = model;
        this.price = price;
        this.size = size;
    }


    @Override
    public void download() {
        System.out.println("Iphone is downloading apps from " + AppStoreName );
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Iphone is texting to "+ phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Iphone is calling " + phoneNumber);
    }

    public void faceTiming(long phoneNumber) {
        System.out.println("Iphone is facetiming " + phoneNumber);
    }

    public void selfie () {
        System.out.println("Iphone is taking selfies");
    }


//4. create a class named iPhone that can inherit from AppleApps interface
//    actions that every iphone can do: texting(), calling(), faceTiming(), selfie()
}
