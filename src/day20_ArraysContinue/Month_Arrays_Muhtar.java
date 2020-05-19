package day20_ArraysContinue;

import java.util.Scanner;

public class Month_Arrays_Muhtar {
    public static void main(String[] args) {

        int [] n = new int [3];
        n[0] = 0;
        n[1] = 1;
        n[2] = 2;


        String [] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"}; //size =12; max index num =11
/*                      //    0     1     2     3    4      5     6...
        String [] month2 = new String[12];   you could do this way, it's longer
        month2[0]="Jan";
        ...
 */
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number");
         int num = input.nextInt();  //18

         int attempts = 1;  //for ex. to give 3 attempts, start from 1, if from 0->4 attempts

 /* if */  while (num > 12 || num <= 0) {
                System.out.println("Invalid Entry");
//              System.exit(0);
                System.out.println("Please re-enter the number");
                num = input.nextInt();  //12
                attempts++;

            if(attempts ==3 && (num>12 || num <=0)){
                System.out.println("Invalid Entry, you already have 3 attempts");
                System.exit(0);
                //break-it will not exit entire program, and will execute bellow st-t, therefore exit
            }
 }

        String result = months[num-1]; //ex to retrieve 0 to get Jan, index number starts from 0 ALWAYS
        System.out.println(result);






    }
}
