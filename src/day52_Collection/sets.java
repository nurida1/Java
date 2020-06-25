package day52_Collection;

import java.util.*;

public class sets {
    public static void main(String[] args) {
        //Set:
        //Set - only accepts unique objects // printed names order is different
        Set<String> names = new HashSet<>();
        names.add("Sha");
        names.add("Zuura");
        names.add("Saban");
        names.add("Ozgur");
        names.add("Ozgur"); //will not be printed
        names.add("Ozgur"); //will not be printed
        names.add("Ozgur"); //will not be printed

        System.out.println(names); //[Zuura, Ozgur, Sha, Saban]

        Set<String> names2 = new LinkedHashSet<>(); //prints the insertion order as it is

        String[] arr = {"A", "A", "C", "B", "A"}; //ACB
        //u can apply set to remove duplicates

        LinkedHashSet <String> set1 = new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(set1); // [A , C , B]

        //System.out.println(set1.get(1)); //does not have index number

        HashSet <String> set2 = new HashSet<>(Arrays.asList(arr));
        System.out.println(set1); // [A , B , C] //different order

        System.out.println("===================================================");
        Set<Integer> numbers = new TreeSet<>();
                    numbers.addAll(Arrays.asList(10, 9, 10, 9, 8 , 7, 8 ,7 , 6 ,5 ,6));
                    //1- remove duplicates
                    //2 - sorts
        System.out.println(numbers); // [5, 6, 7, 8, 9, 10]

        System.out.println("===================================================");

        //TREESET:
        System.out.println("treeset");
        TreeSet<String> treeset = new TreeSet<>();

        //treeset.add(null); doesn't accept null
        System.out.println(treeset);
        //treeSet - doesn't allow null, HashSet - allows null

        //HASHSET:
        System.out.println("hashset");
        HashSet<String > hashSet = new HashSet<>();
        hashSet.add(null);
        System.out.println(hashSet);

        System.out.println("=====================================================");
        //String number = null; //throws exception, bevause nothing to convert it's not string
        String number = "123";
        int num1 = Integer.parseInt(number);
        System.out.println(num1);

        System.out.println("=======================================================");
        //String [] arr2 = {null, "Cybertek", null}; //exception if arr[2].toUpperCase(); ,doesn't refer to any object
        String [] arr2 = {null, "Cybertek", null};
        arr[2].toUpperCase(); //instance of a String

       String name1 = "Cybertek".toUpperCase();
        name1 = null;
        //name1 = name1.toLowerCase(); //Null pointer exception

        System.out.println(name1); //null pointer exception

        TreeSet<String> treeset2 = new TreeSet<>();
        treeset2.add(null);

        System.out.println(treeset2);



    }


}
