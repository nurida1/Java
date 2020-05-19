package day38_Constructors;

public class Dog {
    // Constructor Method Overloading:
    // To overload a method ==> same method name BUT must have different parameters
    // advantages of overloaded methods: readable, efficient, easy to remember, reusable, easy to maintain
    // Constructor is a METHOD ==> we can apply overloading
    // we can have multiple constructors in a class (by implementing method overloading)

    String name;
    String breed;
    int age;

    // I will create a constructor that will allow me to initialize only the breed of dog: like this:
    public Dog () {
        name = "unknown";
        breed = "unknown";
        age = 0;
    }

    public Dog (String breed) {
        name = "unknown";
        this.breed = breed;
        this.age = age;
    }

    public Dog (String breed, int age) {
        this.breed = breed;
        this.age = age;
        name = "unknown";
    }

    public String toString () {
        return "Name: " + name + ", breed: " + breed + ", age: " + age;
    }




/*
    public void method1() {

    }

    public void method1( int a) {

    }

 */


}
