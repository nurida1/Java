package day48_Abstraction;

public interface _10A {


        int a = 100;//public static final variables by default


        public void method1(); //abstract methods by default

        public static void method2() {
            System.out.println("static method");
        }

        public default void method3() {
            System.out.println("default method");
        }

        interface B2 {
            public abstract void method1();

            public static void method2() {
                System.out.println("static method");
            }

            public default void method3() {
                System.out.println("default method");
            }
        }

        public abstract class C2 implements _10A, B2 {

            @Override
            public void method1() {

            }

            public static void main(String[] args) {

                _10A.method2();
            }

            @Override
            public void method3() {

            }

        }
    }

