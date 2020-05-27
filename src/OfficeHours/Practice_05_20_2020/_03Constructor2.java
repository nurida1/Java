package OfficeHours.Practice_05_20_2020;

class test {
    public test ( String str ) {
        System.out.println("default");
    }
    public test ( int a) {
        System.out.println("int");
    }

    public test ( double a ) {
        System.out.println("double");
    }

}

    public class _03Constructor2 extends test {

        public _03Constructor2 () {
            super("Hello"); //String
            System.out.println("default"); //default
        }

    /* in instance method you cannot call the parent's constructor
    public void method() {
        super ("Hello");
    }
     */

    public static void main(String[] args) {

            _03Constructor2 obj = new _03Constructor2(); //default

        }
    }







