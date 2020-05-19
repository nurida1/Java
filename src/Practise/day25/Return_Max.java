package Practise.day25;

public class Return_Max {
    // max from a and b

    public static void main(String[] args) {
    int result = max(10,15);
        System.out.println(result);
        System.out.println(max2(1445,1255));
    }


    public static int max (int a, int b) {

        int max=0;
        if (a >= b) {
            max = a;
        }else {
            max = b;
        }
        return max;
    }

    public static int max2 (int a , int b) {

        if (a>=b){
            return a;
        }
        return b;
    }
}
