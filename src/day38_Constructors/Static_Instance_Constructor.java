package day38_Constructors;
/*
static block vs instance block vs Constructor
1. static block gets executed first as soon as class runs (even before print anything in main method
2. static block gets executed once (for all objects)
3. instance block depends on object: NO OBJECT = NO execution of instance block. It runs before Constructor
4. constructor: depends on the object: NO OBJECT = NO execution: Executes once we create object ==> runs after instance block
 */
public class Static_Instance_Constructor {

public Static_Instance_Constructor() {
    System.out.println("constructor");
}

    {
        System.out.println("instance block"); //instance block executes once we create an object BEFORE Constructor
        // a copy of instance block will print for each object (if we create 2 objects==> "instance block" will print two times)
    }

    public static void main(String[] args) {

            new Static_Instance_Constructor(); //instance, constructor
        System.out.println("Main method");

        //new Static_Instance_Constructor(); // instance, constructor
}
    static {
        System.out.println("Static block"); //  THIS GETS PRINTED FIRST BEFORE ANYTHING ELSE even though we placed it at the end
        // but it runs only ONE TIME for all objects
    }
}
// This is how this will read on the console after creating two objects:
       /*
             Static block
            instance block
            constructor
            Main method
        */