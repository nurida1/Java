package day44_Exceptions;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class try_catchBlocks2 {

    public static void main(String[] args) {
        System.out.println("Hello");

        try {
            //Thread.sleep(15000); //prints in 15 seconds
            Thread.sleep(3000);
            System.out.println("Try block");

        }catch (Exception e) { //whenever there is unchecked, unexpected events it will handle
            System.out.println("Catch block");
        }

        System.out.println("World");
    }


}
