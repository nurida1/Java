package day37_Constructors;

public class Question12 {

    static String name = "Aaron";

    public static void main(String[] args) {
        System.out.println("Daniel");   //Daniel
    }

    public static void print(String str) {  //if this st-t is not static, than static block will not work
        System.out.println( str );

    }

    static { //static block executed first as soon as class is loaded.
        print(name);  //Aaron
    }
}

class Test1 {
    //int Inum = 10;  // 2, each object has its own copy of instances
    static int Inum = 10; //there is only one copy of static that's shared by all objects

    public static void main(String[] args) {
        Test1 obj1 = new Test1();
              obj1.Inum = 20; // now we assigned a new value to this instance variable
                // obj1's own copy of instance variable Inum is 20 (not 10)

        Test1 obj2 = new Test1(); // since instance variable is already initialized as 10 ==> default value is 10 and not 0

        System.out.println(obj2.Inum); // this will print the default value which is in this case 10 becuase it is given like this before


    }
}
