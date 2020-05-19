package day13_StringClass;

// import java.lang.String; not necessary all the class in "Java.lang" package made automatically

public class StringLiterals {

    public static void main(String[] args) {
        String str1 = "Cat"; //String Pool
        String str2 = new String("Cat"); //Java Heap

        System.out.println(str1+" :"+str2);
        System.out.println(str1 == str2); // two different objects, false

        String str3 = "Cat"; // String pool

        System.out.println(str1==str3); //true,

        String str4 = new String ("Cat");
        System.out.println(str2==str4); //two independent objects, false

        String s1 = "Java"; //String Pool, immutable we cannot modify it,
        s1 = "JavaScript"; // new object will be created in memory

        System.out.println(s1);

        String s2 = "Java"; // no new object will be created in the memory
        System.out.println(s1==s2); //false
        //"JavaScript" == "Java"


    }
}
