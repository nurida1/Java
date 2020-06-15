package day50_polymorphism;

public class Warm_up {
    /*

    1. cerate a class Animal
            variables: age, gender
            methods: eat, sleep
        DO NOT make abstract we need this for today's example
    2. create subclass of Animal named Cat
            variable: catName
            methods: scratch
    3. create subclass of Animal named Dog
            variable: dogName
            methods: bark
     */


    class Animal {
        int age;
        char gender;

        public void eat () {
            System.out.println("Animal is eating");
        }

        public void sleep() {
            System.out.println("Animal is sleeping");
        }

    }

    class Cat extends Animal{
        String catName;

        public void scratch() {
            System.out.println("Cat is scratching");
        }

    }

    class Dog extends Animal {
        public void bark() {
            System.out.println("Dog is barking");
        }
    }



}
