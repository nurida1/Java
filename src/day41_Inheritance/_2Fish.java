package day41_Inheritance;

public class _2Fish extends _2Animal{
    //String name; //if u don't extend, than use this to declare

    public void swim () {
        System.out.println(name + " is swimming");
    }

    public static void main(String[] args) {

        _2Fish obj1 = new _2Fish();
        obj1.name = "Nemo";
        obj1.weight = 5;
        obj1.size = "small";


        obj1.eat();
        obj1.move();
        obj1.swim();
        //obj1.bark(); we dont have this action in dog object
    }



}
