package Practise.LinkedIn.Coin;

public class Coin_Main {
    public static void main(String[] args) {

      //  Coin c = new Coin(Coin.HEADS); because we deleted initial value Constructor
        Coin c = new Coin();  //instance of a class
        System.out.println("Initial: "+ c.getFaceUp());
        for (int i =0; i < 10; i++) {
            c.flip();
            System.out.println("After Flip: " + c.getFaceUp());
        }
    }


}
