package OfficeHours.Practice_04_29_2020;

import java.util.ArrayList;
/*
        ArrayList: does not support primitives
        size is dynamic, size is auto-adjusted
            HAS INDEX NUMBERS
       add(), get(), size(), set(), remove(), clear(), indexOf(), lastIndexOf();

        add(): inserting
        set(): replacing

        remove(int)
        remove(object)

        */
public class ArrayList_Methods {

    public static void main(String[] args) {
//add:
         ArrayList<Integer> list = new ArrayList<>();
                list.add(10);
                list.add(20); // {10, 20}
                list.add(1,30); //adds the element at the given index
                        //   {10, 30, 20}

        System.out.println(list);
        System.out.println(list.size());

//get: retrieveng the objects from array list

        //[10, 20, 30]
        // 0   1   2

        long num1 = list.get(2); //Integer 20,  //unboxing

        byte a = 100;
        //Integer b = a;

        Byte a2 = 100;
        int b2 =a2;  //unboxing

//get: used for getting the specific element from the list
        ArrayList<String> list2 = new ArrayList<>();
                    list2.add("A");
                    list2.add("B");
                    list2.add("C");
                    list2.add("D");

                    // {A, B, C, D};   ==> // {A, B, E, C, D};
                    list2.add(2, "E");
        System.out.println(list2);

        for (int i =0; i < list2.size(); i++) { //i: 0, 1, 2, 3, 4
            String str = list2.get(i);
            System.out.println(str);
        }

            System.out.println("============================");
        for (String each : list2 ) {
            System.out.println(each);

        }
//set: used for replacing

            //list2: {A, B, E, C, D}; , replace C with F

            list2.set(3, 'F' + ""); // {A, B, F, D}
            System.out.println(list2);

//remove(int)

            //remove index number, removes all matching ones, returns boolean

        // list2: {A, B, E, F, D}
        //             0  1  2  3  4

            list2.remove(3); // {A, B, E, D}
        System.out.println(list2);

        //list2: {A, B, E, D}

//remove(object) - first matching object will be removed,
        boolean r1 = list2.remove("A"); //{B, E, D}
        System.out.println(list2);

        System.out.println(r1); //true

        boolean r2 = list2.remove("Z");
        System.out.println(r2); //false

//clear:

        list2.clear(); // size: 0
        System.out.println(list2.size()); //[]


        }






    }




