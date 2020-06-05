package OfficeHours.Practice_05_27_2020;

public class methodOverriding {

    protected void method1() {
        System.out.println("Super class");
    }
    }




    class Test extends methodOverriding {
        //sub           super

        @Override //to check if it's overriden, if it's no error, than it was overriden succesfully
       public void method1() { //access modifier has to be same or more visible
            System.out.println("Sub class");
        }

        public static void main(String[] args) {

             Test obj = new Test();
             obj.method1(); //super class
        }

    }






