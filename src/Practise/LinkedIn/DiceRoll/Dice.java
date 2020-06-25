package Practise.LinkedIn.DiceRoll;

import java.util.Random;

public class Dice {
    Random rand;
    int previousRoll = -1; //u can never roll to -1; in order not to mess up

    public Dice () {
        this.rand = new Random();
    }

    public int roll() {
        int currentRoll = this.rand.nextInt(6) + 1; //from 1 -6
        this.previousRoll = currentRoll;
        return currentRoll;
    }

}
