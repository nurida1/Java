package day50_polymorphism;
/*
 1. cerate a class Animal
            variables: age, gender
            methods: eat, sleep
        DO NOT make abstract we need this for today's example
 */

//2 var, 2 ins
public abstract class _1Animal { //u cannot create objects from Abstract class

    public int age;
    public String gender;

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    public static void methodA() { //u cannot override static method
        System.out.println("Animal Class");
    }






}
