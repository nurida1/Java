package day40_Encapsulation;
/*
please check package: day38_Constructor
            class   : c09_StaticB_InstanceB_Constructor
for rules related to execution of this task
 */
public class Quiz_Question12 {

    public static String name = "Osman"; // public static variable

    public Quiz_Question12 () { //consructor
        name = "Hilal";
    }

    { //instance block
        name = "Marionela";
    }

    static {
        name = "Madina";
    }

    public static void main(String[] args) {
    //    System.out.println(name); //Madina
        // there is nothing else to execute
        // and we haven't created an object
        // No object = No execution of instance block or Constructor
   Quiz_Question12 obj = new Quiz_Question12();
   //name = madina;
    //name = "Marionela";
    //name = "Hilal";     //if u create object than HILAL will be final result

        System.out.println(name);
    }

}
