package ArraysLab;

import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstInput = scanner.nextLine().split(" ");
        int[] nums = new int[firstInput.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(firstInput[i]);
        }

        while (nums.length > 1){
            int[] condensed = new int[nums.length - 1];

            for (int i = 0; i < nums.length -1; i++) {
                condensed[i] = nums[i] + nums[i + 1];
            }

            nums = condensed;
        }
        System.out.println(nums[0]);



    }
}
