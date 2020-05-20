package OfficeHours.Practise_05_13_2020;

public class staticBlock {
    //static variable:
    static String str;
    //static Excel sheet
    int a = 100;

    //static block:
    static  {    // If we initialize the static var here then we can use it in this class and in other classes too
        str = "Cybertek";
        str = "Harvard";
        str = "MIT";

        //a=300;
    }
    // here is our main method for staticBlock class
    public static void main(String[] args) {
        str = "Cybertek";
        System.out.println(str);
    }

}

class staticBlockTest {
    public static void main(String[] args) {
        System.out.println(staticBlock.str);
    }
}




