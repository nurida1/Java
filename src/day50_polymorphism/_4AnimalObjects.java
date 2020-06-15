package day50_polymorphism;

public class _4AnimalObjects {

    public static void main(String[] args) {

        _3Dog obj1 = new _3Dog("Lucy", 5, "Female");
        System.out.println(obj1.dogName);
        obj1.bark();

       _1Animal obj2 = new _3Dog("Kito", 5, "Female");
        //reference type = object type

//1st rule:   Parent decides what can be accessible
        //Reference type decides what can be called or accessed
        //System.out.println(obj2.dogName); //u cannot call
        //obj2.bark(); //u cannot call from Animal reference type(decides whether u can call it), those actions are in Dog class only.

        obj2.eat();//calls from Dog class, because it was overriden
//2nd rule:  if both methods exists in reference type and object type, the overriden one will be executed
        //if method is not overriden method of parent class will be executed

        //making parents accessible to all child objects
        obj2.eat();
        obj2.methodA();

        System.out.println("============================================");
        _1Animal animal1 = new _2Cat("A", "F", 1);

        boolean isCat = animal1 instanceof _2Cat;
        //instance of - returns boolean
        System.out.println(isCat);

        _1Animal d1 = new _3Dog("A", 1, "f");
        //_3Dog d1 = new _3Dog("A", 1, "f");
        //to instance of - should be is a relation
        //boolean r1 = d1 instanceof _2Cat; //there is no IS A relation between Cat and Dog

        _1Animal animal2 = new _2Cat("Q", "F",2);
        boolean r2 = animal2 instanceof _1Animal;
        System.out.println(r2); //true -> animal2 is Animal ( IS A relation)
    }



}
