package MethodsExercises;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")) {

            if (input.equals(isPalindrome(input))){
                System.out.println("true");
            }else {
                System.out.println("false");
            }

            input = scanner.nextLine();

        }


    }

    private static String isPalindrome(String enterString) {
        char[] input = enterString.toCharArray();
        String result = "";
        for (int i = input.length - 1; i >= 0; i--) {
            result += input[i];
        }
        return result;
    }

}
