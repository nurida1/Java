package day26_MethodOverloading;

public class MethodOverloading4 {

    public static void main(String[] args) { // [] args comment line argument, String can accept anything - numbers, chars, etc
        System.out.println("String");
        //this is a valid main method, u have run option
    }

    public static void main(double[] args) {
        System.out.println(6.4);
        //there is no run option for this method, invalid method
    }


    public static void main(int[] args) {
        System.out.println(10);
    }

}
