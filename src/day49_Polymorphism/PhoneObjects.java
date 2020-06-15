package day49_Polymorphism;

public class PhoneObjects {
    public static void main(String[] args) {
        iPhone phone1 = new iPhone("Iphone X Pro", 1500, "10 inches");
        System.out.println(phone1);
        phone1.calling(911);
        phone1.texting(911);
        phone1.faceTiming(911);
        phone1.selfie();
        phone1.download();
        



    }


}
