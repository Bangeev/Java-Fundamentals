package MethodsExercises;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            if (isDivisibleByEight(i) && isNumOdd(i)) {
                System.out.println(i);
            }
        }


    }

    private static boolean isDivisibleByEight(int num) {

        int sum = 0;
        while (num != 0) {

            int lastDigit = num % 10;
            sum += lastDigit;
            num = num / 10;
        }
        return sum % 8 == 0;
    }

    private static boolean isNumOdd(int num) {
        while (num != 0){
            int lastDigit = num % 10;

            if (lastDigit % 2 == 1){
                return true;
            }
            num = num / 10;
        }
        return false;
    }

}
