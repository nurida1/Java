package day52_Collection;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q {

    public static void main(String[] args) {
        //Queue - poll method, FIFO, removes first object
        Queue<String> q = new PriorityQueue<>(); //FIFO
        q.add("A");
        q.add("B");
        q.add("C");
        q.add("D");
        System.out.println(q);//[A, B, C, D]

        String str = q.poll(); //returns A
        System.out.println(str); //A

        System.out.println(q);//[B, C, D]

        //System.out.println(q.get(0)); //u cannot use this method

        Queue<String> q2 = new PriorityQueue<>(Arrays.asList("N", "U", "R", "I", "D", "A"));
        System.out.println(q2);

        String str2 = q2.poll();
        System.out.println(str2);
    }


}
