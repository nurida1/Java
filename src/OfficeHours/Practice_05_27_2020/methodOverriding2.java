package OfficeHours.Practice_05_27_2020;

public class methodOverriding2 {
    protected void method1() {
    }

    public static void method2() {
    }

    public methodOverriding2() {
    }
}

class TestClass extends methodOverriding2 {

    @Override
    protected void method1 () {}

    //@Override
    //public static void method2 () {}

  //  public methodOverriding2() {} // constructor name has to be same with class name

    //static and constructor you cannot override it
}

