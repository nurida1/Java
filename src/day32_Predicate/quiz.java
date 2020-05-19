package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class quiz {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Robb");
        list1.add("Bran");
        list1.add("Rick");
        list1.add("Bran");
        if (list1.remove("Bran")) {
            list1.remove("John");
        }

        System.out.println(list1);


        ArrayList<String> list2 = new ArrayList<>();
        list2.add("green");
        list2.add("red");
        list2.add("blue");
        list2.add("yellow");
        list2.add(3, "cyan");
        System.out.println(list2);

        ArrayList<String> list = new ArrayList<>();
        Integer a = 1;
        System.out.println(list.remove(a));


        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(1,2,3,4,5));

        list4.set(0, list4.get(4));
        list4.set(4, list4.get(0));

        System.out.println(list4);




}



    }








