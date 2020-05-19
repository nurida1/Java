package Practise.practise;
import java.util.Scanner;

public class UniqueNums {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter numbers");
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        for (int j = 0; j < nums.length; j++) {
            int count = 0;

            for (int i = 0; i < nums.length; i++) {
                if(nums[i] == nums[j]) {
                    count++;
                }
            }

            if(count == 1) {
                System.out.print(nums[j]);

            }
        }
    }
}
