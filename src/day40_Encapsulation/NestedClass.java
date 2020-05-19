package day40_Encapsulation;

public class NestedClass {

// this is a nested class: because we created inside NestedClass class
    // Inner class (data class ) can be static
    // But outer class (NestedClass) can not be static
    // if inner class is static ==> it will become member of the outer class NestedClass
    // advantage: it can be called through the class name
    //              it can be shared by the objects
    //static accepts statics only ==> static class accepts static variables and methods
    // So I can declare all static variables inside static class data ==> group them all together

    static class data{
        static int a = 100;
        static int b = 300;

    }


    public static void main(String[] args) {

        // I can call static variables through the two classes names like this:
        System.out.println(NestedClass.data.a); // 100
        System.out.println(NestedClass.data.b); // 300
    }






}