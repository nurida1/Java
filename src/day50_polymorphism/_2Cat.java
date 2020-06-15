package day50_polymorphism;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

/*
2.create subclass of Animal named Cat
        variable: catName
        methods: scratch

 */
//3 car, 3 ins methods
public final class _2Cat extends _1Animal { //no error because there are no abstract methods
    public String catName;

    public _2Cat(String catName, String gender, int age) {
        this.catName = catName;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println("Cat " +catName +" is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat " + catName + " is sleeping");
    }

    public void scratch () {  //final, static or make class final, so noone can override methods
        System.out.println("Cat " + catName + " is scratching");
    }



}
