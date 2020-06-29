package day54_Maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Map_SetEntries {

    public static void main(String[] args) {

        //LinkedHashMap<String, Integer>
        LinkedHashMap<String, String> fb = new LinkedHashMap<>();
        //LinkedHashMap - is like a set - doesn't accept duplicates

        fb.put("Tester01", "password1");
        fb.put("Tester02", "password1");
        fb.put("Tester02", "password2");
        fb.put("Tester03", "password3");
        fb.put("Tester04", "password4");
        fb.put("Tester05", "password5");

        //keySet():
        fb.keySet(); // collection of keys data, used for interate the keys in MAP. Returns all the keys as Set

        System.out.println("===========================================");

        for ( String  eachKey  :  fb.keySet() ) {
            //System.out.println(eachKey);
            //Tester01
            //Tester02
            //Tester03
            //Tester04
            // Tester05
            System.out.println(eachKey + " " + fb.get(eachKey));
            //Tester01 password1
            //Tester02 password2
            //Tester03 password3
            //Tester04 password4
            //Tester05 password5
        }
        //return keySet as a List:
        List<String> usernames = new ArrayList<>(fb.keySet());
        System.out.println(usernames);

        System.out.println("=============================================");

        //values: returns all the values from the map as Collection:
            fb.values();
            for ( String eachValue : fb.values() ) {
                System.out.println(eachValue);
            }

        List<String> password = new ArrayList<>(fb.values() );
        System.out.println(password); //[password1, password2, password3, password4, password5]

        System.out.println("===============================================");












    }

}
