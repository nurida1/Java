package day37_Constructors;
/*
There are 2 initializer blocks in Java:
        1. static initializer block: It gets executed first once the class is loaded.
        it gets executed once
        it is designed for initializing static variables
static{
        statement;
        }
        it can be placed anywhere in the class
2. instance initializer block: It belongs to the object ==> every object has its own copy
        execution of this block depends on the object
        if we create object of class ==> executes
        if we don't create object ==> doesn't execute
        designed for initializing instance variables
        {
        statements;
        }
        it can be placed anywhere in the class
 */
public class InstanceBlock {

    static {

        System.out.println("static block");
    }

    //instance block:
    {
        System.out.println("Instance block1"); //get executed for each object 2times, as bellow there are 2 objects

     }

    public static void main(String[] args) {
        InstanceBlock obj = new InstanceBlock();

        InstanceBlock obj2 = new InstanceBlock();
    }

    {
        System.out.println("Instance block2"); //get executed for each object

    }


    // INSTANCE block will get executed as many times as many objects we create.
    // every object we create will have it run one time. Times = number of objects
    // but if we have a static block ==> it will get executed only ONCE

}
