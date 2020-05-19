package day18_NestedLoop;

public class do_While_Practise {
    /*
    print all the even number 0 ~ 100 in the same line separated by a space
     */
    public static void main(String[] args) {
        int num = 0;

        do{
            if (num % 2 !=0) {
                System.out.print(num+" ");

            }
            num++;
        }while(num<=100);
        System.out.println();
        System.out.println("===================");

        int i = 1;
        do {
            // i++; iterates i than prints the result 2,3,4,5,6,
            System.out.println(i);
            i++; //first prints i than increases it: 1,2,3,4,5/ usually you  give iterator at the end

        }while (i <= 5);

        System.out.println("======================");

        int z = 1;
        do {
            System.out.println(z);
            if(z==3) {
                break;    //if you want to exit the loop after 3
            }
            
            z++;
        }while (z <= 5);


    }
}
