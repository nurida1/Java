package day48_Abstraction;

public class _3phoneObjects {

    public static void main(String[] args) {
   _2Iphone iphone1 = new _2Iphone("X", 1000,  "10 inches");
   _2Iphone iphone2 = new _2Iphone("11 Pro Max", 1400, "6.5 inches" );

        System.out.println(iphone1);
        System.out.println(iphone2);

        iphone1.faceTiming(12345);
        iphone1.texting(911);
        iphone1.texting(98765);

        System.out.println("============================================");

        _4Samsung samsung1 = new _4Samsung("Galaxy S20", 1400, "6.2 inches");

        System.out.println(samsung1);

        samsung1.calling(122434);
        samsung1.downloading(122434);
        samsung1.texting(122434);


        System.out.println("==============================================");

        Nokia nokia1 = new Nokia(500, "5 inches");
        System.out.println(nokia1);
        nokia1.calling(12345);
        nokia1.texting(12345);

        nokia1.breakTheFloor();
        nokia1.selfDefence();


    }




}
