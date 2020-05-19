package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ObjectMemory {

    int i =1000; //instance variable -> heap memory

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10,20,30,40));

        ArrayList<Integer> list2 = list1;

        list1.remove(2);
        System.out.println(list1); // [10, 20, 40]

        System.out.println(list2);

        //only 1 object was created

        System.out.println("=====================================================");

        String str1 = new String("cybertek"); // String is immutable
        String str2 = str1;

            str1 = str1.toUpperCase(); // 2 objects are created in java heap

        System.out.println(str1);
        System.out.println(str2);


    }
}
