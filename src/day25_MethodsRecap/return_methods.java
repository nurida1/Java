package day25_MethodsRecap;

public class return_methods {
    public static void main(String[] args) {
        System.out.println(max(10,9));
        System.out.println(max2(10,9));

    }
    // a, b,

    public static int max(int a, int b) {
        int max =0;
        if  (a >= b) {
            max = a;
        }else {
            max = b;
        }
        return max; //exits the st-t, returns value
    }


    public static int max2(int a, int b) {
        if (a >= b) {
            return a; //if if st-t is true, than return st-t will be executed, bellow st-t will not be executed, it exits the method

        }
            return b; // if return a is false, than print b


    }

    }
