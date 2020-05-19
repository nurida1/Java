package day41_Inheritance;

public class _2Dog extends _2Animal {  //can inherit features of animal class
    /*
        public String name;
    public String size;
    public double weight;

    public void eat () {
        System.out.println(name + " is eating");
    }

    public void move() {
        System.out.println(name + " is moving");
    }
     */
//    String name;
//    String size;

    public void bark() {
        System.out.println(name + " is barking");
    }

    public static void main(String[] args) {

        _2Dog dog1 = new _2Dog();
        dog1.name = "Lucy";

        System.out.println(dog1.name);

        dog1.move();
        dog1.eat();
        //dog1.swim(); //you cannot call it, it belongs to Fish class, u didn't extend it
        dog1.bark();
    }



}
