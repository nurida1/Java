package OfficeHours.Practise_05_20_2020;

public class _01Dog extends _01Pet{
    /*
    Dog:
        variables: name, age, color, size, breed, isPet, numberOfEyes
        methods: eat, sleep, drink, toString, bark

    not inherited: bark
     */


    public _01Dog (String name, int age, String color, String size, String breed) {
        setInfo(name, age, color,size,breed);
    }

    public void bark () {
        System.out.println(name + " is barking.");
    }

}
