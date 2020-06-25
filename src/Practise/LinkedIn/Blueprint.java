package Practise.LinkedIn;

public class Blueprint {
    //OOP concepts:
    // 1. Develop a blueprint class
    // 2. Create instances of a class using constructor

    //Java foundations:
    //String, arrays, functions


    // Create a class with three attributes and three functions that represent a dog
    //Create a dog class with bark method, which prints "Bark!" into the console
    //Use the main method in the Main class to create and use an instance of your class

    String breed;
    String name;
    int age;

    public Blueprint(String breed, String name,int age) {
        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    public String eat () {
        return name + " is eating";
    }

    public String sleep() {
        return name + " is sleeping";
    }

    public String bark () {
        return "Dog " + name + " is Barking!";
    }






}
