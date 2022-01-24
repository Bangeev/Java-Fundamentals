package ArraysLab;

import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstInput = scanner.nextLine().split(" ");
        int[] firstArray = new int[firstInput.length];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = Integer.parseInt(firstInput[i]);
        }
        String[] secondInput = scanner.nextLine().split(" ");
        int[] secondArray = new int[secondInput.length];
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = Integer.parseInt(secondInput[i]);
        }

        int maxLenght = Math.max(firstArray.length, secondArray.length);
        int sum = 0;
        boolean areIndentical = true;
        for (int i = 0; i < maxLenght; i++) {
            if (firstArray[i] != secondArray[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                areIndentical = false;
                break;
            }else {
                sum += firstArray[i];
              }

        }
        if (areIndentical){
            System.out.printf("Arrays are identical. Sum: %d",sum);
        }


    }
}
