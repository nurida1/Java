package OfficeHours.Practise_05_20_2020;
/*
 Cat:
     variables: name, age, color, size, breed, isPet, numberOfEyes
     methods: eat, sleep, drink, toString, scratch

  not inherited: scratch
  */
public class _01Cat extends _01Pet {

    public void scratch () {
        System.out.println(name + "is scratching");


    }

    public _01Cat (String name, int age, String color, String size, String breed) {
        //this.name = name; u don't need to repeat 5 times, use set info bellow:
        setInfo(name, age, color,size,breed);
    }








}
