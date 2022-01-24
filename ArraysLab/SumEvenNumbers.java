package ArraysLab;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        int[] numsArr = new int[inputArr.length];

        int sum = 0;
        for (int i = 0; i < numsArr.length; i++) {
           int numbers = Integer.parseInt(inputArr[i]);
            numsArr[i] = numbers;

            if (numsArr[i] % 2 == 0){
                sum += numbers;
            }
        }
        System.out.println(sum);










    }
}
