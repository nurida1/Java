package day49_Polymorphism;

class Animal extends Robot{ //is a relation
    //subclass CA NEVER EVER BE be reference type of superclass's object!!!

}

class Dog extends Animal { //Sub class needs to be non-abstract  u cannot create object from abstract class

}

class Cat extends Animal {

}

class Robot {

}


public class Polymorphism_Intro {

    public static void main(String[] args) {
        //Animal obj = new Animal () ; u cann't create obj from interface or absract
        Animal obj2 = new Dog() ; //u cannot create object from abstract class
        Animal obj3 = new Cat();

        //Dog obj4 = new Cat();

        Dog obj5 = new Dog();
        Cat obj6 = new Cat();

        Robot obj7 = new Robot();

        Animal [] animalShow = { obj5, obj6 };

        Robot obj8 = new Animal();
        Robot obj9 = new Dog();
        Robot obj10 = new Cat();



    }



}

