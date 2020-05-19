package day35_Static;

public class Dog {

    String breed;
    String age;
    static boolean isPet = true; //one copy is shared by all objects

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.breed = "Husky";
        dog1.isPet = true;

        Dog dog2 = new Dog();
        dog2.breed = "Poddle";


        System.out.println(dog1.breed);
        System.out.println(dog2.breed);
        System.out.println(dog1.isPet); //true
        System.out.println(dog2.isPet); //true, even if didn't initialized
    }



}
