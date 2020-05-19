package day37_Constructors;
//Instance variables (Fields)  belong to the object. each object has its own copies of instance variables.
//Any feature that has a static keyword belongs to the class members. Class members are shared by the class and objects.
//STATIC : methods, variables, block and nested classes can be static.
// only one copy of static variable is shared by all objects
// each object has its own copy of instance variable
// if we have multiple objects ==> they will share same STATIC variable but different INSTANCE variable
//


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

// when I create instance variables in this class:==> I have to create dog objects to call these instance variables
class dog {

    String name;   // only belong to the objects of dog class
    int age;      //only belongs to the objects of dog class


    public void setInfo( String name, int age ) {
        // we need to put this. with the variable:
      name = name; //==> this mean instance variable name was not assigned here becuase we did NOT use this.name = name
      age = age;
    }
}


class Test {
    // here in order to be able to use the instance variables from dog class ==> I have to create dog objects
    // I can NOT create Test object and call instance variables name, age from dog's class into Test objects

    public static void main(String[] args) {
//         Test obj = new Test(); --doesn't work
            dog obj = new dog();
        System.out.println(obj.name);
        System.out.println(obj.age);

        dog obj2 = new dog();
        obj2.setInfo("Lucy", 4);

        System.out.println( obj2. name);
        System.out.println( obj2.age ); // 4


        }
    }

public class StaticsReview {

    static int a; //1 copy
    int b;        //2 copies, each object has its own copy of instance variable

    static String name = "John";
            String id = "123";



    public static void main(String[] args) {

        StaticsReview obj1 = new StaticsReview();
        obj1.a = 20;
        //static variable: only 1 copy for all objects

        obj1.b = 10;
        //instance variable: each object has its own copy

        StaticsReview obj2 = new StaticsReview(); //create obj2
        obj2.a = 30;
        //static variable: only one copy for all objects

        obj2.b = 40;

        System.out.println(obj1.a); //30
        System.out.println(obj2.a); //30

        System.out.println( obj1.b ); //10
        System.out.println( obj2.b ); //40, not sharing the same copy

        System.out.println("===============================================");

        System.out.println( name );
        // System.out.println( id );  //static only accept static

        //but:
        obj2.b =5;
        System.out.println(obj2.b); //5, because we initialized it as 5.
        // each object has its own value of instance variable
    }


}
