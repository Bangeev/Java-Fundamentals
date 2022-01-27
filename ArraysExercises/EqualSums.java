package ArraysExercises;

import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numsArray = new int[input.length];

        boolean isEqualIndexHasBeenFound = false;
        for (int i = 0; i < numsArray.length; i++) {
            numsArray[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < numsArray.length; i++) {
            if (numsArray.length - 1 < 1){
                System.out.println("0");
                isEqualIndexHasBeenFound = true;
                break;
            }
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += numsArray[j];

            }
            for (int j = i + 1; j <= numsArray.length - 1; j++) {
                rightSum += numsArray[j];
            }

            if (leftSum == rightSum){
                System.out.println(i);
                isEqualIndexHasBeenFound = true;
                break;
            }
        }
        if (!isEqualIndexHasBeenFound){
            System.out.println("no");
        }




    }
}
