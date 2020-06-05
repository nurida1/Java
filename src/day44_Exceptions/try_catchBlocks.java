package day44_Exceptions;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.util.ArrayList;
import java.util.Arrays;

public class try_catchBlocks {
    public static void main(String[] args) {
        System.out.println("Test started");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        try {
            System.out.println(list.get(10) ); // index out of bound

        } catch (Exception e){ //you can also give parent RuntimeException or child IndexOutOfBoundsException or Grand parent Exception)
            System.out.println("Something went wrong");
        }

        System.out.println("Test completed");
    }
}
