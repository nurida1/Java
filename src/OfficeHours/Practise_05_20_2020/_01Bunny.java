package OfficeHours.Practise_05_20_2020;
/*
 Cat:
     variables: name, age, color, size, breed, isPet, numberOfEyes
     methods: eat, sleep, drink, toString, Dig

  not inherited: Dig
  */
public class _01Bunny extends _01Pet{

    public _01Bunny(String name, int age, String color, String size, String breed) {
        setInfo(name, age, color,size,breed);

    }


    public void dig () {
        System.out.println( name + " is digging");
    }




}
