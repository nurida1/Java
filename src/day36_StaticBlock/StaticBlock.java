package day36_StaticBlock;

public class StaticBlock {



    public static void main(String[] args) {
        System.out.println("Hello Cybertek");
    }

    public static void method1 () {
        System.out.println("Custom method executed");
    }

    static {
        System.out.println("static block executed");
    }
    //static block executed
    //Hello Cybertek
}
