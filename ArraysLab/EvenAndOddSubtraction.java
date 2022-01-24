package ArraysLab;

import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputLine = scanner.nextLine().split(" ");

        int[] numbers = new int[inputLine.length];

        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int num = Integer.parseInt(inputLine[i]);
            numbers[i] = num;

            if (num % 2 == 0){
                evenSum += numbers[i];
            }else {
                oddSum += numbers[i];
            }


        }
        System.out.println(evenSum - oddSum);



    }
}
