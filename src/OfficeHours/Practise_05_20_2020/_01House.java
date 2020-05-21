package OfficeHours.Practise_05_20_2020;

public class _01House {

    public static void main(String[] args) {

        _01Dog dog1 = new _01Dog("Karabas", 5, "black", "large", "Husky");
                //dog1.setInfo("Karabas", 5, "black", "large", "Husky");

        _01Dog dog2 = new _01Dog("Rindik", 5, "white", "Huge", "Kangal");

        System.out.println( dog1 );
        System.out.println( dog2 );

        System.out.println("===================================================");
        _01Cat cat1 = new _01Cat("Muffin", 7, "white", "medium", "Ragdoll");
        //cat1.setInfo("Muffin", 7, "white", "medium", "Ragdoll");
        System.out.println(cat1);

        cat1.scratch();
        //cat1.bark;

        _01Bunny bunny1 = new _01Bunny("Bug",3, "white", "small", "tiny");
        System.out.println(bunny1);
        bunny1.dig();
        //bunny1.scratch();
    }




}
