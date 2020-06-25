package Practise.LinkedIn.DiceRoll;

//Create a dice roll program, where the user can roll the die and the program will output the value of that dice
//Input: User must input something in the console to roll the dice
//Output: The program prints out the outcome of two random rolls (assuming the user is rolling two dice at a time)



public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();
        System.out.println("Previous: "  + dice.previousRoll);
        System.out.println(dice.roll());
        System.out.println("Previous: "  + dice.previousRoll);
        System.out.println(dice.roll());
        System.out.println("Previous: "  + dice.previousRoll);
    }




}
