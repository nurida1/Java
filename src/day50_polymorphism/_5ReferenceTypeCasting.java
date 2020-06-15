package day50_polymorphism;

import day41_Inheritance._2Dog;

public class _5ReferenceTypeCasting {

    public static void main(String[] args) {
        //UPCASTING:
        int a = 100;
        //double b = a; //implicitly done (smaller type u can assign to larger type. Done automatically) -> superior
        double b = (double)a; //u can do manually, but not needed, as intelli-J do automatically

        _3Dog dog = new _3Dog("a", 1, "f"); //-> smaller type - u can assign this variable DOg to the Animal
        //_1Animal animal1 = dog; //upcasting, done implicitly
        _1Animal animal1 = (_1Animal)dog; //upcasting manually, done implicitly(automatically)

        _2Cat cat = new _2Cat("r", "female",4);
        //_3Dog dog2 = _3Dog(cat); //u cannot apply reference type casting, because there is no IS A relation

        _1Animal animal2 = (_1Animal) cat; //subclass: cat, super: Animal. Done automatically

        System.out.println("============================================");

        //DOWNCASTING:

        double c = 10;
        int d = (int)c; //explicitly done

        _1Animal animal3 = new _3Dog("A", 12, "F");

        _3Dog dog3 = (_3Dog)animal3; //downcasting - MUST to be done manually

        _1Animal animal4 = new _2Cat("C", "female", 7);

        _2Cat cat2 = (_2Cat)animal4;

        System.out.println("=====================================================");

        _1Animal animal5 = new _3Dog("Lucy", 3, "Female");
        // reference       object
        //animal5.bark(); doesn't work

        //first way:
        _3Dog dog2 = (_3Dog)animal5;
        dog2.bark(); //Dog Lucy is barking

         //second way: it should be completely cast to subclass type, we use parantheses
        ( (_3Dog) animal5 ).bark(); //Dog Lucy is barking

        ((_3Dog) animal5).bark();




    }



}
