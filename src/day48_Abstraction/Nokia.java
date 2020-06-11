package day48_Abstraction;

public class Nokia extends _1Phone {

    static {
       String brand = "Nokia";
    }

    public Nokia (double price, String size) {
        this.price = price;
        this.size = size;
        model = "Brick";
    }

    public void breakTheFloor() {
        System.out.println("Nokia is breaking the floor");
    }

    public void selfDefence () {
        System.out.println("I'm defending myself with Nokia");
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Nokia is calling with phone number " + phoneNumber);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Nokia is texting with phone number " + phoneNumber);
    }


}
