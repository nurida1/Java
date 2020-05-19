package Practise.practise;

import java.util.ArrayList;

public class List_Practise3 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add ("Milk");
        list.add("Coffee");
        list.add("Bread");
        list.add("Cookie");
        list.add("Choko");

        System.out.println(list);

        for(int i =0; i<5; i++) {
            System.out.println(list.get(i));
        }

    }

}
