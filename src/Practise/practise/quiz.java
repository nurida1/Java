package Practise.practise;

public class quiz {

    public static void main(String[] args) {

        String opt = "true";
        switch (opt) {
            case "true":
                System.out.println("True");
                break;
            default:
                System.out.println("false");
        }
        System.out.println("Done");


        float f1 = (12_345.1 > 123_45.0) ? 12_456 : 124_56.02f;
        float f2 = f1 + 1024;
        System.out.println(f2);

        float f3 = (1_560.0 > 12_60) ? 10 : 20;
        System.out.println(f3);

        int x = 1;
        switch (x) {
            case 1:
            System.out.println("One");
        }


        int z = 10;
        switch (z) {
            case 10 :
                System.out.println("Monday");
            case 11:
                System.out.println("Tuesday");
            default:
            System.out.println("Friday");
        }


    }
}