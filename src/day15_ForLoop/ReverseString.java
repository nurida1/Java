package day15_ForLoop;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Java is fun"; //avaJ
        //            0123

    String reverse1 = "" + str.charAt(3) + str.charAt(2) + str.charAt(1) + str.charAt(0);

//============================================//
    int lastIndexnum = str.length()-1;

    String reverse2 = "";

    for (int i = lastIndexnum; i>=0; i--) {
//      System.out.print(str.charAt(i));
        reverse2 += str.charAt(i);
    }
        System.out.println(reverse2);








    }
}
