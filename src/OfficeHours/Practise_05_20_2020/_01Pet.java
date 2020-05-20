package OfficeHours.Practise_05_20_2020;

public class _01Pet {
    /*
    custom class: pet
            variables: name, age, color, size, breed, isPet, numbersOfeyes

            methods:   eat, sleep, drink, toString
     */

    protected String name;
    protected int age;
    protected String color;
    protected String size;
    protected String breed;

    protected static boolean isPet = true;
    protected static int numberOfEyes = 2;

    public void eat (String food) {
        System.out.println(name + " is eating " + food);
    }

    public void drink (String drink) {
        System.out.println(name + " is drinking " + drink);
    }

    public void sleep (String place) {
        System.out.println(name + " is sleeping at " + place);
    }

    public String toString () {
        return "Name: " + name + ", age: " + age + ", color: " + color + ", size: " + size +
                ", breed: " + breed;
    }


}
