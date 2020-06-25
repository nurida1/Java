package Practise.LinkedIn.Coin;

import java.util.Random;

public class Coin {
    public final static int HEADS =0;
    public final static int TAILS =1;

    private int faceUp;
   /*
    public Coin(int start) { //constructor, we can start with head or tail etc
        faceUp = start;
    }
    */

    public Coin() {
        flip();
    }
    public void flip() {  //random number generator
        Random rand = new Random();
        faceUp = rand.nextInt(2); //out bound is 2
    }
    public String getFaceUp() {
        if (faceUp == HEADS) {
            return "HEADS";
        }else if (faceUp == TAILS) {
            return "TAILS";
        }else {
            return "INVALID";
        }

    }

}
