package day05_Unary_ShorthandOperators;

public class PostPrePractice {
    public static void main(String[] args) {
        int a =50;
        a = --a + a++ + a-- + a++;
        // a=  49+  49 + 50 + 49 = 197
        System.out.println(a); // 197

        System.out.println(++a); //198

        System.out.println( a++); //198
        System.out.println(a); //199

        int b = 1;
        b= -b-- + b++ / -b-- * --b;
        System.out.println(b);



    }



            }
